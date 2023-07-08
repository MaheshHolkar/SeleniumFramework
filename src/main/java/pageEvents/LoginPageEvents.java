package pageEvents;

import org.testng.Assert;

import pageObject.LoginPageElements;
import utils.ElementFetch;

public class LoginPageEvents {
	ElementFetch ele = new ElementFetch();

	public void verifyLoginPageIsLoaded() {
		Assert.assertTrue(ele.getWebElements("XPATH", LoginPageElements.loginText).size() > 0, "Element not founds");
	}

	public void enterCredentials() {

		ele.getWebElement("XPATH", LoginPageElements.emailAddressfield).sendKeys("maheshholkar");
		ele.getWebElement("XPATH", LoginPageElements.passwordfield).sendKeys("12432");

	}
}
