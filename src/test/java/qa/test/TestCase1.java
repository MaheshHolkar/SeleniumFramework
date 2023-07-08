package qa.test;

import org.testng.annotations.Test;

import base.BaseTest;
import io.qameta.allure.Step;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;
import utils.ElementFetch;

public class TestCase1 extends BaseTest{
  
	ElementFetch ele = new ElementFetch();
	HomePageEvents homePage = new HomePageEvents();
	LoginPageEvents loginPage = new LoginPageEvents();
	
	@Step("Test case 001")
	@Test
  public void sampleMethodForEnteringCredentials() {
		logger.info("Signin into LoginPage");
		homePage.signInButton();
		logger.info("Verifying if login text is present or not");
		loginPage.verifyLoginPageIsLoaded();
		logger.info("Enter the Credentials");
		loginPage.enterCredentials();
  
  }
}
