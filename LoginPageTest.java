package com.brightside.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;

//This class contains login credentials of login page

public class LoginPageTest extends BasePage {

	@Test
	public void loginPageTestCase() throws InterruptedException {
		try {
			initReport("Login Test started! for : " + getBrowserName());
			BaseLoginPage loginPageObj = PageFactory.initElements(driver,
					BaseLoginPage.class);
			Assert.assertTrue(loginPageObj.signBt().isDisplayed(),
					"It is displayed");
			loginPageObj.clickSign();
			reportInfo("Clicked on Sign In button in BrightSide Page!");
			String s = driver.getCurrentUrl();
			softAssert.assertEquals(s,
					"http://dev.angular.brightsidementoring.tudip.uk/sign-in");
			softAssert.assertTrue(loginPageObj.emailBt().isDisplayed(),
					"It is displayed");
			loginPageObj.setEmail(getPropertyValue("email"));
			reportInfo("Entered the user email in signin page");
			softAssert.assertTrue(loginPageObj.passwordButton().isDisplayed(),
					"It is displayed");
			loginPageObj.setPassword(getPropertyValue("password"));
			Thread.sleep(4000);
			softAssert.assertTrue(loginPageObj.signinButton().isDisplayed(),
					"It is displayed");
			softAssert.assertTrue(loginPageObj.signinButton().isEnabled(),
					"It is enabled");
			loginPageObj.clickSignin();
			Thread.sleep(4000);
			reportPass("Login Page testcases passed successfully!");
		} catch (Exception ex) {
			reportFailure("Login Page Testcase fail! :: Exception : "
					+ ex.getMessage());
		}
	}
}
