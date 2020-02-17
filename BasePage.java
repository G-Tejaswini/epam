package com.basedemo;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class BasePage{
         BaseTest basetest=new BaseTest();
public void login(WebDriver driver) throws InterruptedException, IOException
	{
		driver.navigate().to("http://dev.angular.brightsidementoring.tudip.uk/");
        Thread.sleep(2000);
       // System.out.println(basetest.getPropertyValue("email"));
        String s = driver.getCurrentUrl();
        Assert.assertEquals("http://dev.angular.brightsidementoring.tudip.uk/",s,"not found");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement sign=driver.findElement(By.xpath("//a[@class='sign-in']"));
		sign.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		//email.sendKeys("ova_daniel@tudip.com");
		//System.out.println(basetest.getPropertyValue("username")+"value");
		email.sendKeys(basetest.getPropertyValue("email"));
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//password.sendKeys("tudip123");
		password.sendKeys(basetest.getPropertyValue("password"));
		Thread.sleep(2000);
		WebElement sign1=driver.findElement(By.xpath("//input[@type='submit']"));
		sign1.click();
		Thread.sleep(2000);
}
}

