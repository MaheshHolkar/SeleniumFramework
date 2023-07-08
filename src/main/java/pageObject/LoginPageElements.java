package pageObject;

public interface LoginPageElements {
	String loginText = "//div[text()='Login']";
	String emailAddressfield = "//input[@name='email' and @placeholder='Email']";
	String passwordfield = "//*[@placeholder='Password']";
}
