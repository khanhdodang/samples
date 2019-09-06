package iosWeb;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import configs.Configs;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import io.appium.java_client.ios.IOSDriver;

public class Ios_web {
	IOSDriver<WebElement> driver = null;

	@Given("^User starts a session on iOS device$")
	public void start_an_ios_web_session() throws MalformedURLException {
		driver = new IOSDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesiOSWeb());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://the-internet.herokuapp.com/login");
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
}