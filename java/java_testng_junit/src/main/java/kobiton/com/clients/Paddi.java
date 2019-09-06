package kobiton.com.clients;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumCommandInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.remote.AppiumCommandExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.HttpCommandExecutor;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import kobiton.com.configs.Configs;

public class Paddi {
    public static AppiumDriver driver = null;
    String kobitonServerUrl = "https://tommyncn:027fb09e-f787-44bd-bc7c-5f9220aff257@api.kobiton.com/wd/hub";

    public static final DesiredCapabilities desiredCapabilitiesAndroidWeb(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
// The generated session will be visible to you only. In case you want this session available for other users, please assign this device to specific group.
        capabilities.setCapability("sessionName", "Automation test session");
        capabilities.setCapability("sessionDescription", "");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("browserName", "chrome");
        capabilities.setCapability("deviceGroup", "KOBITON");
// For deviceName, platformVersion Kobiton supports wildcard
// character *, with 3 formats: *text, text* and *text*
// If there is no *, Kobiton will match the exact text provided
        capabilities.setCapability("deviceName", "Galaxy A7(2016)");
//        capabilities.setCapability("platformVersion", "8.0.0");
        capabilities.setCapability("platformName", "Android");
        return capabilities;
    }

    @BeforeTest
    public void Setup() {
        try {
            int con_timeout = 1200000;
            int soc_timeout = 90000;

            HttpCommandExecutor executor = new HttpCommandExecutor(MobileCommand.commandRepository, new URL(kobitonServerUrl));
            driver = new AppiumDriver(new URL(kobitonServerUrl), desiredCapabilitiesAndroidWeb());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
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

    @Test
    public void test() {
        driver.get("https://locator-qa1.padiww.com/?lang=en");
        driver.findElementByXPath("//button[contains(@class,'submitBtn')]").click();
    }

}
