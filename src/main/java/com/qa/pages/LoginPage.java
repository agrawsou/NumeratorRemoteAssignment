package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.TestUtils;

public class LoginPage extends TestBase{

	@FindBy(xpath="//input[@id='helloEmail' and @name='email']")
	WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	WebElement emailNext;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	

	@FindBy(xpath="//span[text()='Sign in']")
	WebElement signIn;
	
	@FindBy(xpath="//div[contains(@class,'btn-group-inner')]/a/span")
	WebElement footer;
	
	@FindBy(xpath="//div[contains(@class,'pull-right menuItem')]//div[contains(@class,'btn-group ng-scope dropdown btn-group-info')]/button")
	WebElement userButton;
	
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public void applicationLogin(String un, String pass) throws InterruptedException {
		email.sendKeys(un);
		emailNext.click();
		TestUtils.waitForElement(password, 20);
		password.sendKeys(pass);
		signIn.click();
		}
	
	public String verifyHomepageFooter() {
		TestUtils.waitForElement(footer, 30);
		String footerValue = footer.getText();
		return footerValue;
	}
	
	public void selectUser(String value) throws InterruptedException {
		userButton.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'"+value+"')]")).click();
	}
	
	
}
