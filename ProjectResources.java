package com.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.basedemo.BaseTest;

public class ProjectResources extends BaseTest {
	
	//By projects = By.xpath("//a[@href='/project_resources']");
//	By link1 = By.xpath("//*[@class='resources-title']/a");
	@Test
	public void projectResources() throws InterruptedException
	{   
		actions = new Actions(driver);
        WebElement proj=driver.findElement(By.xpath("//a[@href='/project_resources']"));
		actions.moveToElement(proj).click().perform();
		Thread.sleep(5000);
		System.out.println("clicked");
		Thread.sleep(5000);
		WebElement link =driver.findElement(By.xpath("//*[@class='resources-title']/a"));
		link.click();
		actions.moveToElement(link).build().perform();
		System.out.println("link opned");
		Thread.sleep(7000);
		
	}
}

