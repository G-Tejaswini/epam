package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;
import com.extendreports.ExtentTestManager;

import java.io.IOException;

public class Account extends BaseTest{
	@Test
	public void accountUpdate() throws InterruptedException, IOException
	{   
		System.out.println("myaccount started");
		Thread.sleep(5000);
		//WebElement account=driver.findElement(By.xpath("//*[@id='mySidenavR']/ul/li[2]/a"));
		//softAssert.assertEquals(account.isDisplayed(),"not displayed");
		//account.click();
		Thread.sleep(5000);
		doClick("//*[@id='mySidenavR']/ul/li[2]/a");
		Thread.sleep(5000);
		//WebElement firstName=driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[1]/div/input"));
		//softAssert.assertEquals(firstName.isDisplayed(),"not displayed");
	
		//firstName.sendKeys("Tanshu");
		doType("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[1]/div/input","Tanshu");
		Thread.sleep(4000);
		//WebElement lastName=driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[2]/div/input"));
		//softAssert.assertEquals(lastName.isDisplayed(),"not display");
	
		//lastName.sendKeys("g");
		doType("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[2]/div/input","g");
		Thread.sleep(4000);
		//WebElement email=driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[3]/div/input"));
		//softAssert.assertEquals(email.isDisplayed(),"not display");
	
		//email.sendKeys("ova_daniel@tudip.com");
		doType("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[3]/div/input","ova_daniel@tudip.com");
		Thread.sleep(3000);
		//WebElement postCode=driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[5]/div/input"));
		//softAssert.assertEquals(postCode.isDisplayed(),"not display");
		//postCode.clear();
		doType("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[5]/div/input","AB99AB");
	
		Thread.sleep(4000);
		Thread.sleep(5000);
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[6]/div/select[1]")));
		dropdown.selectByVisibleText("1");
		Thread.sleep(5000);
		Select dropdown1 = new Select(driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[6]/div/select[2]")));
		dropdown1.selectByVisibleText("jan");
		Thread.sleep(5000);
		Select dropdown2 = new Select(driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[6]/div/select[3]")));
		dropdown2.selectByVisibleText("1997");
		Thread.sleep(5000);
	    //postCode.sendKeys("AB99AB");
	   // WebElement update=driver.findElement(By.xpath("/html/body/app/main/pages/div/div/div/my-account/account-info/div/div[2]/div/form/div[7]/input"));
	   // softAssert.assertEquals(update.isDisplayed(),"not display");
	   // update.click();
		Thread.sleep(4000);
		System.out.println("myaccount updated");
		//loginTestExtent("Account");
		 //takeScreenShot("Account");
		Thread.sleep(9000);	
		 //setMyTestCaseName("Account");
		ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");

		//takeScreenShot("Account");
	/*	 WebElement updateaccountinfobtn = driver.findElement(By.xpath("//input[@ formcontrolname=\"postCode\"]"));
		   //updateaccountinfobtn.clear();
		   updateaccountinfobtn.click();
		   Thread.sleep(1000);
		   System.out.println("myaccount testcase completed ");
		*/
	}


}