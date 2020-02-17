package com.testcase;
   
    import org.testng.annotations.Test;

import com.basedemo.BaseTest;
import com.extendreports.ExtentTestManager;

import java.io.IOException;

//import org.testng.annotations.Test;
	import org.openqa.selenium.By;

	import org.openqa.selenium.WebElement;
	//import org.testng.annotations.Test;

	public class Dashboard extends BaseTest {	
		@Test(priority=1)
		public void dashBoard() throws InterruptedException, IOException
		{
			System.out.println("dashboard test case started");
			Thread.sleep(4000);
			//WebElement b1=driver.findElement(By.xpath("//*[@class='btn']"));
			//b1.click();
			//softAssert.assertEquals(b1.isDisplayed(),"It is not display");
			doClick("//*[@class='btn']");
			Thread.sleep(2000);	
			System.out.println("dashboard test case ended");
			//loginTestExtent("DashBoard");
			//takeScreenShot("DashBoard");
			Thread.sleep(9000);	
			//setMyTestCaseName("DashBoard");	
			ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");

		}
		

	}


