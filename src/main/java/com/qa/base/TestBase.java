package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public static Properties prop;
    FileInputStream fi;
    public static WebDriver driver;
	
	public TestBase() {
		prop = new Properties();
		try {
			fi = new FileInputStream("C:\\Users\\USER\\Project\\DemoTest\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void initialization() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		
		}
}
