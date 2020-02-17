package com.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;
import com.extendreports.ExtentTestManager;

public class SignOut extends BaseTest{
	@Test
	public void signout () throws InterruptedException, IOException
	{   System.out.println("signout test case started");
		Thread.sleep(5000);
	  /*  WebElement signout=driver.findElement(By.xpath("//*[@id=\'mySidenavR\']/ul/li[9]/a"));
		signout.click();
		softAssert.assertEquals(signout.isDisplayed(),"not display");*/
		doClick("//*[@id='mySidenavR']/ul/li[9]/a");
		Thread.sleep(5000);
		System.out.println("signout test case ended");
		//loginTestExtent("SignOut");
		//takeScreenShot("SignOut");
		//setMyTestCaseName("signOut");
		ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");

	}

}
