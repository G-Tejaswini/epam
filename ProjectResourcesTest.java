package com.brightside.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;
import com.brightside.pages.ProjectResourcesPage;

//This class is about project resources and new tab is opened in this project resources

public class ProjectResourcesTest extends BasePage {

	@Test
	public void projectResourcesTestCase() throws InterruptedException {
		try {
			initReport("Project Resources Test started! for : "
					+ getBrowserName());
			BaseLoginPage loginPageObj = PageFactory.initElements(driver,
					BaseLoginPage.class);
			loginPageObj.clickSign();
			loginPageObj.setEmail("ova_daniel@tudip.com");
			loginPageObj.setPassword("tudip123");
			loginPageObj.clickSignin();
			Thread.sleep(4000);
			ProjectResourcesPage projectObj = PageFactory.initElements(
					this.driver, ProjectResourcesPage.class);
			softAssert.assertTrue(projectObj.projectBtn().isDisplayed(),
					"displayed");
			projectObj.clickProjectResources();
			Thread.sleep(4000);
			reportInfo("Clicked on project resources in Brightside mentoring");
			String projectLink = "http://dev.angular.brightsidementoring.tudip.uk/project_resources";
			Assert.assertEquals(projectLink,
					"http://dev.angular.brightsidementoring.tudip.uk/project_resources");
			projectObj.clickResources();
			reportInfo("Clicked on the link");
			softAssert.assertTrue(projectObj.resButton().isDisplayed(),
					"displayed");
			softAssert
					.assertTrue(projectObj.resButton().isEnabled(), "Clicked");
			reportPass("Project Resouces Page testcases passed successfully!");
		} catch (Exception e) {
			reportFailure("Project Resources Page Testcase fail! :: Exception : "
					+ e.getMessage());
		}
	}
}
