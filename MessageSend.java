package com.brightside.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class contains the page object implementation of Mentoring page.

public class MessageSend {
	WebDriver driver;

	public MessageSend(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@id='mySidenavR']/ul/li[1]/a")
	WebElement msgBtn;
	@FindBy(how = How.XPATH, using = "//*[@id='chat__input']")
	WebElement input;
	@FindBy(how = How.XPATH, using = "//*[@id='chat__input']")
	WebElement msgSend;
	@FindBy(how = How.XPATH, using = "//*[@id='chat__send-message']")
	WebElement sendBtn;

	public void clickMessageButn() throws InterruptedException {
		msgBtn.click();
		Thread.sleep(4000);
	}

	public WebElement msgButton() {
		return msgBtn;

	}

	public void inputClick() throws InterruptedException {
		input.click();
		Thread.sleep(4000);
	}

	public WebElement inputBtn() {
		return input;

	}

	public void sendMessage(String message) throws InterruptedException {
		msgSend.sendKeys(message);
		Thread.sleep(4000);
	}

	public WebElement mssgSend() {
		return msgSend;

	}

	public void sendButton() throws InterruptedException {
		sendBtn.click();
		Thread.sleep(5000);
	}

	public WebElement sendButtonValue() {
		return sendBtn;

	}
}