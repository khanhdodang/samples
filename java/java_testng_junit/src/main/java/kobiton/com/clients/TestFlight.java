package kobiton.com.clients;

import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestFlight {
    public static IOSDriver driver = null;

    @BeforeTest
    public void Setup() {
        URL url = null;
        try {
            String kobitonServerUrl = "https://username:xxx5@api.kobiton.com/wd/hub";

            url = new URL(kobitonServerUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("sessionName", "TestFlight");
        capabilities.setCapability("sessionDescription", "This is an example for iOS App testing");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("app", "https://s3-ap-southeast-1.amazonaws.com/kobiton-devvn/apps-test/HybridIOSApp.ipa");
        capabilities.setCapability("deviceGroup", "ORGANIZATION");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("udid", "xxx");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("printPageSourceOnFindFailure", true);

        driver = new IOSDriver<WebElement>(url, capabilities);

        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    @AfterTest
    public void Teardown() {
        try {
            if(driver != null)
                driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean isAppInstalled(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        final boolean isInstalled = (Boolean)driver.executeScript("mobile: isAppInstalled", params);
        return  isInstalled;
    }

    boolean terminateApp(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        boolean wasRunningBefore = (Boolean)driver.executeScript("mobile: terminateApp", params);
        return wasRunningBefore;
    }

    void launchApp(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        driver.executeScript("mobile: launchApp", params);
    }

    void activateApp(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        driver.executeScript("mobile: activateApp", params);
    }

    void queryAppState(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        int state = (Integer)driver.executeScript("mobile: queryAppState", params);
        switch (state) {
            case 0:
                System.out.println("0: The current application state cannot be determined/is unknown");
                break;
            case 1:
                System.out.println("1: The application is not running");
                break;
            case 2:
                System.out.println("2: The application is running in the background and is suspended");
                break;
            case 3:
                System.out.println("3: The application is running in the background and is not suspended");
                break;
            case 4:
                System.out.println("4: The application is running in the foreground");
                break;
        }
    }

    void installApp(String appPath) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("app", appPath);
        driver.executeScript("mobile: installApp", params);
    }

    void removeApp(String bundleId) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("bundleId", bundleId);
        driver.executeScript("mobile: removeApp", params);
    }

    String testflightBundleId = "com.apple.TestFlight";
    String testedAppBundleId = "com.apple.TestFlight";
    public void Precondition() {
        launchApp(testflightBundleId);
        driver.findElementByXPath("//XCUIElementTypeButton[@label='Continue']").click();
    }

    void handlePopup() {
        try {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            HashMap<String, String> tapObject = new HashMap<String, String>();
            tapObject.put("action", "accept");
            tapObject.put("label", "Allow");
            js.executeScript("mobile:alert", tapObject);
        } catch (Exception ex){

        }
    }

    @Test
    public void test() {
        System.out.println("Is TestFlight installed? " + isAppInstalled(testflightBundleId));
        Precondition();
        handlePopup();

    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
