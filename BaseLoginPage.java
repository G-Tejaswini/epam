package com.brightside.pages;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class contains the page object implementation of Login page.

public class BaseLoginPage extends BasePage{
	WebDriver driver;

	public BaseLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@class='sign-in']")
	WebElement signin;
	@FindBy(how = How.XPATH, using = "//input[@type='email']")
	WebElement emailField;
	@FindBy(how = How.XPATH, using = "//input[@type='password']")
	WebElement password1;
	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement signin1;

	public void clickSign() throws InterruptedException {
		signin.click();
		Thread.sleep(4000);
	}

	public WebElement signBt() {
		return signin;
	}

	public void setEmail(String email) throws InterruptedException {
		emailField.sendKeys(email);
		Thread.sleep(4000);
		
	}

	public WebElement emailBt() {
		return emailField;
	}

	public void setPassword(String pword) throws InterruptedException,
			IOException {
		password1.sendKeys(pword);
		Thread.sleep(4000);
	}

	public WebElement passwordButton() {
		return password1;
	}

	public void clickSignin() throws InterruptedException {
		signin1.click();
		Thread.sleep(4000);
		
	}

	public WebElement signinButton() {
		return signin1;

	}
}
