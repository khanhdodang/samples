package iosWeb;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import configs.Configs;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.appium.java_client.ios.IOSDriver;
import utils.Utils;

public class Ios_web {
	static IOSDriver<WebElement> driver = null;

	@Given("^User starts a session on iOS device$")
	public void start_an_ios_web_session() throws MalformedURLException {
		driver = new IOSDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesiOSWeb());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
        String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
        System.out.println("https://portal-test.kobiton.com/sessions/" + kobitonSessionId);
	}

	@Given("^User go to login page$")
	public void go_to_login_herokuapp_page() {
		driver.get("https://the-internet.herokuapp.com/login");
	}

	@And("^User inputs username ([^\"]*)$")
	public void user_input_username(String username) {
		driver.findElementById("username").clear();
		driver.findElementById("username").sendKeys(username);
	}

	@And("^User inputs password ([^\"]*)$")
	public void user_input_password(String password) {
		driver.findElementById("password").clear();
		driver.findElementById("password").sendKeys(password);
	}

	@And("^User clicks login button$")
	public void user_click_login() {
		driver.findElementByXPath("//form[@name='login']").submit();
	}

	@Then("^User will see message ([^\"]*)$")
	public void user_verify_message(String msg) {
		Utils.sleep(2);
		Assert.assertTrue(getMessage().contains(msg));
	}

	@Given("^User ends session on iOS device$")
	public void end_an_ios_web_session() {
		try {
			if (driver != null)
				driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getMessage() {
		return driver.findElementById("flash").getText();
	}
}