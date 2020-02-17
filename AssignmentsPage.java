package com.brightside.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

//This class contains the page object implementation of Assignments page.

public class AssignmentsPage {
	WebDriver driver;

	public AssignmentsPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//*[@href='/assignments']")
	WebElement assignmentButn;
	@FindBy(how = How.XPATH, using = "//*[@class='hide-file-input']")
	WebElement updateButn;
	@FindBy(how = How.XPATH, using = "//*[@class='submit-assignment']/a")
	WebElement submitButn;
	@FindBy(how = How.XPATH, using = "//*[@href='/assignments']")
	WebElement assMentor;
	@FindBy(how = How.XPATH, using = "/html/body/app/main/pages/div/div/div/assignments/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
	WebElement mentorpath;

	public void assignmentButnClick() throws InterruptedException {
		assignmentButn.click();
		Thread.sleep(4000);
	}

	public WebElement assBtn() {
		return assignmentButn;

	}

	public void updateAssignment(String path) throws InterruptedException {
		updateButn.sendKeys(path);
		Thread.sleep(4000);
	}

	public WebElement upBtn() {
		return updateButn;

	}

	public void clickSubmitButn() throws InterruptedException {
		submitButn.click();
		Thread.sleep(4000);
	}

	public WebElement submitButton() {
		return submitButn;

	}

	public void assignmentMentor() throws InterruptedException {
		assMentor.click();
		Thread.sleep(4000);
	}

	public WebElement mentorPathValue() {
		return mentorpath;

	}
}
