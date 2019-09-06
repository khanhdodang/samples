package androidApp;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import configs.Configs;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import io.appium.java_client.android.AndroidDriver;

public class Android_app {
	AndroidDriver<WebElement> driver = null;

	@Given("^User starts a session on android device$")
	public void start_an_android_app_session() throws MalformedURLException {
		driver = new AndroidDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesAndroidApp());
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	}

	@Given("^User ends session on Android device$")
	public void end_an_android_app_session() {
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