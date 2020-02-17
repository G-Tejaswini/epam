package com.brightside.testcases;

import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.brightside.pages.Account;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;

//This class is about account update

public class AccountUpdateTest extends BasePage {

	@Test
	public void updateAccountTestCase() throws InterruptedException {
		try {
			initReport("Account Test started! for : " + getBrowserName());
			BaseLoginPage loginPageObj = PageFactory.initElements(driver,
					BaseLoginPage.class);
			loginPageObj.clickSign();
			loginPageObj.setEmail("ova_daniel@tudip.com");
			loginPageObj.setPassword("tudip123");
			loginPageObj.clickSignin();
			Thread.sleep(4000);

			Account accPageObj = PageFactory.initElements(this.driver,
					Account.class);
			accPageObj.accountButn();
			reportInfo("Clicked on MyAcount in Brightside mentoring");
			String account = "http://dev.angular.brightsidementoring.tudip.uk/users/785/edit";
			Assert.assertEquals(account,
					"http://dev.angular.brightsidementoring.tudip.uk/users/785/edit");
			softAssert.assertTrue(accPageObj.firstNameBtn().isDisplayed(),
					"It is displayed");
			accPageObj.firstNameField("Tanshu");
			reportInfo("Entered the firstname in account");
			softAssert.assertTrue(accPageObj.lastNameBtn().isDisplayed(),
					"It is displayed");
			accPageObj.lastNameField("g");
			reportInfo("Entered the lastname in account");
			softAssert.assertTrue(accPageObj.emailBtn().isDisplayed(),
					"It is displayed");
			accPageObj.getEmailField();
			reportInfo("Entered the gmail in account");
			softAssert.assertTrue(accPageObj.postCodeBtn().isDisplayed(),
					"It is displayed");
			accPageObj.getPostCode("AB99AB");
			reportInfo("Entered the postcode in account");
			accPageObj.getDate();
			reportInfo("Entered the date in account");
			Thread.sleep(4000);
			softAssert.assertTrue(accPageObj.updateBtn().isDisplayed(),
					"It is displayed");
			softAssert.assertTrue(accPageObj.updateBtn().isEnabled(),
					"It is clickable");
			accPageObj.updateAccount();
			reportPass("Account Page testcases passed successfully!");
		} catch (Exception e) {
			reportFailure("Account Page Testcase fail! :: Exception : "
					+ e.getMessage());
		}

	}
}
