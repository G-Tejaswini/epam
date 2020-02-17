package com.brightside.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;
import com.brightside.pages.SignOutPage;

//This class is about the sign out 

public class SignOutTest extends BasePage {
	@Test
	public void signOutTestCase() throws InterruptedException {
		try {
			initReport("Signout Test started! for : " + getBrowserName());
			BaseLoginPage loginPageObj = PageFactory.initElements(this.driver,
					BaseLoginPage.class);
			loginPageObj.clickSign();
			loginPageObj.setEmail("ova_daniel@tudip.com");
			loginPageObj.setPassword("tudip123");
			loginPageObj.clickSignin();
			Thread.sleep(4000);

			SignOutPage signOutBt = PageFactory.initElements(driver,
					SignOutPage.class);
			softAssert.assertTrue(signOutBt.signoutbtn().isDisplayed(),
					"displayed");
			softAssert.assertTrue(signOutBt.signoutbtn().isEnabled(),
					"It is clicked");
			signOutBt.clickSignOut();
			reportInfo("Clicked on signout button");
			Thread.sleep(4000);
			String url = "http://dev.angular.brightsidementoring.tudip.uk/";
			softAssert.assertEquals(url,
					"http://dev.angular.brightsidementoring.tudip.uk/");
			reportPass("SignoutPage Page testcases passed successfully!");

		} catch (Exception e) {
			reportFailure("Signout Page Testcase fail! :: Exception : "
					+ e.getMessage());
		}
	}
}
