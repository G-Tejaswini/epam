package com.testcase;

import java.io.IOException;

//import org.testng.Assert;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;
import com.extendreports.ExtentTestManager;

public class LoginPage extends BaseTest{
	@Test(priority=0)
	public void loginPage() throws InterruptedException, IOException
	{
		
		System.out.println("login started");
		
		Thread.sleep(4000);
		ExtentTestManager.getTest().setDescription("Login Scenario with wrong username and password.");
		System.out.println("login ended");
		softAssert.assertEquals(driver.getTitle(),"Brightside mentoring");
		System.out.println("equals");
		Thread.sleep(4000);
		
		//takeScreenShot("LoginPage");
		//setMyTestCaseName("LoginPage");
		///loginTestExtent("LoginPage");
		//getPropertyValue("email");
		
	}

}
