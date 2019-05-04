package com.qa.utils;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.base.TestBase;

public class TestUtils extends TestBase {

	public static void waitForElement(WebElement locator,int timeout) {

		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	}
}
