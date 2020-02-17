package com.brightside.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class contains the page object implementation of Sign out page.

public class SignOutPage extends BasePage {
	public WebDriver driver;

	public SignOutPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mySidenavR']/ul/li[9]/a")
	WebElement signOutButn;

	public WebElement signoutbtn() {
		return signOutButn;
	}

	public void clickSignOut() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", signOutButn);
		actions = new Actions(driver);
		actions.moveToElement(signOutButn).click().build().perform();
		Thread.sleep(5000);
	}
}
