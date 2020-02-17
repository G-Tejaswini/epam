package com.brightside.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.support.PageFactory;
import com.brightside.pages.BaseLoginPage;
import com.brightside.pages.BasePage;
import com.brightside.pages.MessageSend;

//This class is about sending the message in mentoring

public class MessageSendTest extends BasePage {

	@Test
	public void messageTestCase() throws InterruptedException {
		try {
			initReport("Messaging Test started! for : " + getBrowserName());
			BaseLoginPage loginPageObj = PageFactory.initElements(driver,
					BaseLoginPage.class);
			loginPageObj.clickSign();
			loginPageObj.setEmail("ova_daniel@tudip.com");
			loginPageObj.setPassword("tudip123");
			loginPageObj.clickSignin();
			Thread.sleep(4000);
			MessageSend msgPageObj = PageFactory.initElements(this.driver,
					MessageSend.class);
			softAssert.assertTrue(msgPageObj.msgButton().isDisplayed(),
					"displayed");
			msgPageObj.clickMessageButn();
			reportInfo("Clicked on mentoring in brightside mentoring");
			String msg = "http://dev.angular.brightsidementoring.tudip.uk/channels";
			Assert.assertEquals(msg,
					"http://dev.angular.brightsidementoring.tudip.uk/channels");
			Thread.sleep(4000);
			softAssert.assertTrue(msgPageObj.inputBtn().isDisplayed(),
					"displayed");
			msgPageObj.inputClick();
			reportInfo("Clicked on type message");
			String randomtext = randomMessage(7);
			msgPageObj.sendMessage(randomtext);
			softAssert.assertTrue(msgPageObj.sendButtonValue().isDisplayed(),
					"displayed");
			softAssert.assertTrue(msgPageObj.sendButtonValue().isEnabled(),
					"displayed");
			msgPageObj.sendButton();
			reportInfo("Clicked on send button");
			reportPass("Message Page testcases passed successfully!");

		} catch (Exception e) {
			reportFailure("Message  Page Testcase fail! :: Exception : "
					+ e.getMessage());
		}
	}
}
