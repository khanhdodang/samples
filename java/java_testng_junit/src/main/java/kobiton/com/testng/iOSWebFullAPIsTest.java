package kobiton.com.testng;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import kobiton.com.configs.Configs;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class iOSWebFullAPIsTest {
    public static IOSDriver<WebElement> driver = null;

//    public static final URL kobitonServerUrl(){
//        try {
//            return new URL("http://127.0.0.1:4723/wd/hub");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }
//
//    public static final DesiredCapabilities desiredCapabilitiesiOSdWeb(){
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "safari");
//        capabilities.setCapability("deviceName", "iPhone*");
//        capabilities.setCapability("platformName", "iOS");
//        return capabilities;
//    }

    @BeforeTest
    public void Setup() {
        driver = new IOSDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesiOSWeb());
//        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @Test
    public void PerformanceTouchIDEndpoints() {
        driver.performTouchID(false); // Simulates a failed touch
        driver.performTouchID(true); // Simulates a passing touch
        driver.toggleTouchIDEnrollment(true);
    }

    @Test
    public void InteractionsEndpoints() {
        driver.shake();
        driver.lockDevice();
        driver.unlockDevice();
        boolean isLocked = driver.isDeviceLocked();
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

    void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
