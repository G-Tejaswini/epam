package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;

public class Assignments extends BaseTest {
		
	By assignment=By.xpath("//*[@href='/assignments']");
	By upload=By.xpath("//*[@class='hide-file-input']");

   
@Test
public void verifyAssignment() throws InterruptedException
{
	//Assignments assign=new Assignments();
	//assign.assignment();
    assignment();
}

public void assignment() throws InterruptedException
{
	actions=new Actions(driver);
	Thread.sleep(5000);
//	driver.findElement(assignment).click();
//	Thread.sleep(5000);
//    driver.findElement(upload);
//	System.out.println("Test 1");
//	driver.findElement(upload).sendKeys("/home/lt-05/Downloads/Brightside_Test_Assignment.txt");
//	System.out.println("file uploaded");
//	Thread.sleep(5000);
//	//submit.click();
//	WebElement submit=driver.findElement(By.xpath("//*[@class='submit-assignment']/a"));
//	Thread.sleep(5000);
//	actions.moveToElement(submit).click().build().perform();
//	//doClick("(//*[text()='Submit'])");
//	Thread.sleep(5000);
//	System.out.println("file submit");
//	Thread.sleep(4000);
	
	driver.findElement(assignment).click();
	Thread.sleep(5000);
	driver.findElement(upload).sendKeys("/home/lt-05/Downloads/Brightside_Test_Assignment.txt");
	Thread.sleep(5000);
	System.out.println("File has been selected");
	//wait=new WebDriverWait(driver,100);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='submit-assignment']/a")));
   // waitCondition("//*[@class='submit-assignment']/a");
	//waitClickable(By.xpath("//*[@class='submit-assignment']/a"));
	Thread.sleep(10000);
	By submit_assignment = By.xpath("//*[@class='submit-assignment']/a");
	//Assert.assertFalse(driver.findElement(submit_assignment).isDisplayed());
	//Thread.sleep(3000);
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class='submit-assignment']/a")));
	driver.findElement(submit_assignment).click();
	System.out.println("File has been uploaded");
}

}


