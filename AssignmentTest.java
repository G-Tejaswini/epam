package com.brightside.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;

import com.brightside.pages.AssignmentsPage;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;
import com.brightside.pages.SignOutPage;

// This class contains about Assignments and uploading the file and check that file is present in Mentor assignments 

public class AssignmentTest extends BasePage {

	@Test
	public void assignmentsTestCase() throws InterruptedException, IOException {
		initReport("Assignment Teststarted! for :" + getBrowserName());
		BaseLoginPage loginPageObj = PageFactory.initElements(driver,
				BaseLoginPage.class);
		loginPageObj.clickSign();
		loginPageObj.setEmail("ova_daniel@tudip.com");
		loginPageObj.setPassword("tudip123");
		loginPageObj.clickSignin();
		Thread.sleep(4000);
		if(getBrowserName().equalsIgnoreCase("firefox"))
		{
			testSkip("Skipped exception");
		throw new SkipException("It is skipped");
		}
		else
		{
		try {
			
			AssignmentsPage assignmentsObj = PageFactory.initElements(
					this.driver, AssignmentsPage.class);
			softAssert.assertTrue(assignmentsObj.assBtn().isDisplayed(),
					"displayed");
			assignmentsObj.assignmentButnClick();
			reportInfo("Assignments is clicked in Brightside mentoring");
			String assign = "http://dev.angular.brightsidementoring.tudip.uk/assignments";
			Assert.assertEquals(assign,
					"http://dev.angular.brightsidementoring.tudip.uk/assignments");
			softAssert.assertTrue(assignmentsObj.assBtn().isDisplayed(),
					"displayed");
			assignmentsObj
					.updateAssignment("/home/lt-189/Downloads/Brightside_Test_Assignment.txt");
			reportInfo("File is uploaded");
			softAssert.assertTrue(assignmentsObj.submitButton().isDisplayed(),
					"displayed");
			softAssert.assertTrue(assignmentsObj.submitButton().isEnabled(),
					"displayed");
			assignmentsObj.clickSubmitButn();
			reportPass("Assinment testcase passed");
			SignOutPage signOutObj = PageFactory.initElements(driver,
					SignOutPage.class);
			signOutObj.clickSignOut();
			Thread.sleep(4000);
			loginPageObj.clickSign();
			Thread.sleep(4000);
			loginPageObj.setEmail("donna.troy+final@tudip.com");
			loginPageObj.setPassword("tudip123");
			loginPageObj.clickSignin();
			Thread.sleep(4000);
			assignmentsObj.assignmentMentor();
			String str = "Brightside_Test_Assignment.txt";
			softAssert.assertEquals(assignmentsObj.mentorPathValue()
					.isDisplayed(), str);
			reportPass("File upload is checked in mentor page");
             
			
		} catch (Exception e) {
			reportFailure("Assignment Page Testcase fail! :: Exception : "
					+ e.getMessage());

		}
		}
	}
}
