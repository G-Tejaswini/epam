package com.brightside.pages;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class contains the page object implementation of Project Resources page.

public class ProjectResourcesPage {
	WebDriver driver;

	public ProjectResourcesPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//a[@href='/project_resources']")
	WebElement projectResource;
	@FindBy(how = How.XPATH, using = "//*[@class='resources-title']/a")
	WebElement resources;

	public void clickProjectResources() throws InterruptedException {
		projectResource.click();
		Thread.sleep(4000);
	}

	public WebElement projectBtn() {
		return projectResource;

	}

	public void clickResources() throws InterruptedException {
		resources.click();
		Thread.sleep(5000);
		ArrayList<String> tabs = new ArrayList<String>(
				driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
		driver.close();
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
	}

	public WebElement resButton() {
		return resources;

	}

}
