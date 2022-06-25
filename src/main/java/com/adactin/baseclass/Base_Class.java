package com.adactin.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.utils.FileUtil;

public class Base_Class {

	public static WebDriver driver; // -->null

	public static String value;

	public static WebDriver getBrowser(String type) {

		if (type.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\kowsalya\\eclipse-workspace\\Cucumber9am\\chrome\\chromedriver_win32 (6)\\chromedriver.exe");

			driver = new ChromeDriver(); // UpCasting

		}

		else if (type.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\chrome\\chromedriver_win32 (5)\\geckodriver.exe");

			driver = new FirefoxDriver(); // UpCasting

		}
		return driver;

	}

	public static void getUrl(String url) {

		driver.get(url);

	}

	public static void clickOnElement(WebElement element) {

		element.click();

	}

	public static void inputValueElement(WebElement element, String value) {

		element.sendKeys(value);

	}

	public static WebDriver close() {

		driver.close();

		return driver;

	}

	public static WebDriver quit() {
		driver.quit();
		return driver;
	}

	

	public static void enabled(WebElement element) {

		boolean enabled = element.isEnabled();

		System.out.println(enabled);

	}

	public static void navigateTo(String name) {

		driver.navigate().to(name);

	}

}
