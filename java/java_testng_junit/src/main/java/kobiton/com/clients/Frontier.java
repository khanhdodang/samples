package kobiton.com.clients;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Frontier {
	public static AndroidDriver<WebElement> driver = null;
	String wrongUsernameMsg = "Your username is invalid!";
	String wrongPasswordMsg = "Your password is invalid!";
	String successMsg = "You logged into a secure area!";

	public static final URL kobitonServerUrl(){
		try {
			String kobitonServerUrl = "https://tritruongkms57:e93740bf-d9a3-47be-8891-520ce58bbaac@api.kobiton.com/wd/hub";

			return new URL(kobitonServerUrl);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static final DesiredCapabilities desiredCapabilitiesAndroidWeb(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("sessionName", "Android Web");
		capabilities.setCapability("sessionDescription", "This is an example for Android Web testing");
		capabilities.setCapability("deviceOrientation", "portrait");
		capabilities.setCapability("captureScreenshots", true);
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceGroup", "ORGANIZATION");
		capabilities.setCapability("deviceName", "*");
		capabilities.setCapability("udid", "3247434f555a3098");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("newCommandTimeout", 120);
		return capabilities;
	}

	@BeforeTest
	public void Setup() {
		driver = new AndroidDriver<WebElement>(kobitonServerUrl(), desiredCapabilitiesAndroidWeb());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@AfterTest
	public void Teardown() {
		try {
			if (driver != null)
				driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 1, description = "should return error when we input wrong username")
	public void testInvalidUsername() {
		login("foo", "SuperSecretPassword!");
		Assert.assertTrue(getMessage().contains(wrongUsernameMsg));
	}

//	@Test(priority = 2, description = "should return error when we input wrong password")
	public void testInvalidPassword() {
		login("tomsmith", "SuperSecretPassword");
		Assert.assertTrue(getMessage().contains(wrongPasswordMsg));
	}

//	@Test(priority = 3, description = "should run test successfully with correct username and password")
	public void testLoginSuccessfully() {
		login("tomsmith", "SuperSecretPassword!");
		Assert.assertTrue(getMessage().contains(successMsg));
	}

	public void login(String userName, String password) {
		driver.get("http://the-internet.herokuapp.com/login");
		driver.findElementById("username").sendKeys(userName);
		driver.findElementById("password").sendKeys(password);
		driver.findElementByXPath("//form[@name='login']").submit();
	}

	public String getMessage() {
		return driver.findElementById("flash").getText();
	}
}
