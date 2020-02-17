package com.basedemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
//import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mentor.LoginPageMentor;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;
	public SoftAssert softAssert;
	public ExtentHtmlReporter reporter;
	public ExtentReports extent;
	public ExtentTest logger;
  	public Properties properties;
  	public BaseTest basetest;
  	public Actions actions;
  	public WebDriverWait waittime;
  	

	@BeforeClass
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"/home/lt-05/eclipse-workspace/gmail_automation/driverexe/chromedriver");
	}

	@BeforeMethod
	public void init() throws InterruptedException, IOException {
		driver = new ChromeDriver();
		softAssert = new SoftAssert();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
		wait = new WebDriverWait(driver,50);
		BasePage obj = new BasePage();
		obj.login(driver); 
	 /*   LoginPageMentor page =new LoginPageMentor();
		page.mentorLogin(driver);*/
	}

	public String doClick(String locatorValue) {
		// WebElement element = driver.findElement(By.xpath(xpathExpression));
		softAssert.assertTrue(findMyElement(locatorValue).isDisplayed());
		findMyElement(locatorValue).click();
		return locatorValue;
	}

	public WebElement findMyElement(String locatorValue) {
		return driver.findElement(By.xpath(locatorValue));
	}

	public String doType(String locatorValue, String value) {
		findMyElement(locatorValue).clear();
		findMyElement(locatorValue).sendKeys(value);
		return locatorValue;

	}

	public void getText(String locatorValue) {
		// findMyelement.getText();
	}

	@AfterMethod
	public void afterMethod() {
		
	}

	// Implement screenshots.
/*	
	@BeforeSuite
	public void initReport() {
		reporter = new ExtentHtmlReporter("./reports/" + "MyAutomationReport" + ".html");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}
*/
	 public void takeScreenShot(String fileName) throws IOException {
		TakesScreenshot doClick = (TakesScreenshot) driver;
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(file, new File("./screenshots/" + fileName + ".png"));
		System.out.println("screenshot taken");
	}
	
/*
  	@AfterSuite
	public void endReport() {
		extent.flush();
	}
	*/
	
/*
	public void setMyTestCaseName(String testCaseName) throws InterruptedException 
	{   
		Thread.sleep(5000);
		logger = extent.createTest(testCaseName);
		System.out.println("extent report");
	}
	*/
	@AfterClass
	public void closeBrowser()

	{
		driver.close();
	}

	public WebDriver getDriver() {
		return driver;
		
	}
    public String getPropertyValue(String key) throws IOException
    {
    	
			FileReader reader= new FileReader("/home/lt-05/eclipse-workspace/basetest_maven/src/test/resources/config.properties");
		    properties = new Properties();
			properties.load(reader);
			return properties.getProperty(key);
		
	 }
 /*
  public void waitCondition(String locator)
  {
	  wait=new WebDriverWait(driver,10);
	  try
	  {
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
	  }
	  catch(Exception e)
	  {
		  System.out.println("not found");
	  }
	  
    }
  public void waitClickable(By elementLocator) 
  {
	  wait=new WebDriverWait(driver,10);
	  try
	  {
	  wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
	  }
	  catch(Exception e)
	  {
		  System.out.println("not found");
	  }
	 
  }*/
  
  
}

   

