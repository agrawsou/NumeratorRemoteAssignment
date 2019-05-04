package com.qa.steps;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.qa.base.TestBase;
import com.qa.pages.LoginPage;
import com.qa.utils.DatabaseConnectionManager;
import com.qa.utils.TestUtils;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SampleStepDef extends TestBase {

	LoginPage login;

	public SampleStepDef() {
		super();
	}

	@Given("^user is on login page$")
	public void userOnLoginPage() {
		initialization();

	}

	@When("^User logins by using the \"(.*)\" and \"(.*)\" as credentials$")
	public void userLogin(String username, String password) throws InterruptedException {
		login = new LoginPage();
		login.applicationLogin(username, password);
	}

	@Then("^User verifies that login is successful$")
	public void verifyLogin() throws InterruptedException {
		login = new LoginPage();
		String actualFooterValue = login.verifyHomepageFooter();
		System.out.println("The actual footer value is : " + actualFooterValue);
		Assert.assertEquals("The footer value is incorrectly displayed", "CFT Development",
				actualFooterValue);
		System.out.println("The footer value is correctly displayed");
	}

	@When("^User selects the desired \"(.*)\" from the user accounts list$")
	public void selectAccount(String account) throws InterruptedException {
		login = new LoginPage();
		login.selectUser(account);
	}

	@Then("^User verifies that the selected \"(.*)\" exists in the database$")
	public void verifyAccountInDB(String account) throws ClassNotFoundException, SQLException {
		String query = "SELECT COUNT(*) FROM account WHERE entry = '" + account + "';";
		DatabaseConnectionManager conManager = new DatabaseConnectionManager();
		ResultSet rs = conManager.retrieveResult(query);
		while (rs.next()) {
			if (rs.getInt(1) >= 1) {
				System.out.println("The account is successfully verified in DB");
			} else {
				Assert.fail("The account does not exist in DB");
			}
		}
		
		conManager.closeConnection();

	}

	@After
	public void tearDown() throws SQLException {
		driver.quit();
	}
}
