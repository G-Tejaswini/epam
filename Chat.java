package com.testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
//import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.Assert;
//import org.testng.annotations.Test;

import com.basedemo.BaseTest;
import com.extendreports.ExtentTestManager;

public class Chat extends BaseTest{
	@Test(priority = 2)
	public void chat() throws InterruptedException, IOException
	{
		doClick("//*[@class='btn']");
	    //WebElement b1=driver.findElement(By.xpath("//*[@class='btn']"));
		//softAssert.assertEquals(s1,"not display");
		//b1.click(); 
		Thread.sleep(2000);	
		System.out.println("chatbot test case started");
		doClick("(//*[@id='chat__input'])");
		Thread.sleep(4000);
		doType("(//*[@id='chat__input'])","abcd");
		Thread.sleep(4000);
		//WebElement msg1=driver.findElement(By.xpath("//*[@id='chat__input']"));
		//softAssert.assertEquals(s2,"not display");
		//msg1.click();
		//str.sendKeys("hi");
        doClick("//*[@id='chat__send-message']");
        Thread.sleep(5000);
		//WebElement send=driver.findElement(By.xpath("//*[@id='chat__send-message']"));
		//softAssert.assertEquals(send.isDisplayed(),"not display");
		//send.click();
		//String value = findMyElement("(//*[@class='msg__message-content msg--pending__message-content'])[last()]").getText();
		//Assert.assertEquals(value,"mentoring");
		System.out.println("chatbot test case  ended");
       // loginTestExtent("Chat");
       // takeScreenShot("Chat");
        Thread.sleep(9000);	
       // setMyTestCaseName("Chat");
      //  ExtentTestManager.getTest().setDescription("Invalid Login Scenario with wrong username and password.");
	}
	//for validating
        public void messageValidate(String message)
        {
        	 wait=new WebDriverWait(driver,50);
        	 wait.until(ExpectedConditions.visibilityOf(getMessageElement(message)));
        }
        public WebElement getMessageElement(String text)
        {
        	String s1="//*(text()='['";
        	String s2="]";
			WebElement element1 = driver.findElement(By.name(s1+"message"+s2));
			WebElement element=driver.findElement(By.xpath("//*(text()='messsage'"));
			wait.until(ExpectedConditions.visibilityOf(getMessageElement(text)));
			Assert.assertTrue(getMessageElement(text).isDisplayed());
			System.out.println("message checked");
			return element;
			
        }
        
}
