package com.mentor;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;

public class LoginPageMentor extends BaseTest
{
	private WebDriver driver;
	public void LoginPageMentor(WebDriver driver)
	{
		   super();
		   this.driver = driver;
		   this.login(this.driver);
	}
	
	public void login(WebDriver driver) throws InterruptedException
	{
		driver.navigate().to("http://dev.angular.brightsidementoring.tudip.uk/");
        Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement sign=driver.findElement(By.xpath("//a[@class='sign-in']"));
		sign.click();
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));
		email.sendKeys("donna.troy+testuser@tudip.com");
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("tudip123");
		Thread.sleep(2000);
		WebElement sign1=driver.findElement(By.xpath("//input[@type='submit']"));
		sign1.click();
		Thread.sleep(2000);

	
	}
}

