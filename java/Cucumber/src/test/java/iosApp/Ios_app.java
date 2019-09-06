package iosApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import configs.Configs;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import io.appium.java_client.ios.IOSDriver;

public class Ios_app {
	IOSDriver<WebElement> driver = null;

	@Given("^User starts a session on ios device$")
	public void start_an_ios_app_session() throws MalformedURLException {
		driver = new IOSDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesiOSApp());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}
	
	@Given("^User ends session on ios device$")
	public void end_an_ios_app_session() {
		try {
			if (driver != null)
				driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void sleep(int seconds) {
	    try {
	      Thread.sleep(seconds * 1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	  }
}