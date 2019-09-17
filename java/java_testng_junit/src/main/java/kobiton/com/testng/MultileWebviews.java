package kobiton.com.testng;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import kobiton.com.configs.Configs;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.util.ArrayList;


public class MultileWebviews {

    private String APP_ANDROID = "https://github.com/cloudgrey-io/the-app/releases/download/v1.10.0/TheApp-v1.10.0.apk";

    private AndroidDriver driver;
    private static By hybridScreen = MobileBy.AccessibilityId("Dual Webview Demo");
    private static By webview = By.className("android.webkit.WebView");

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "*");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("app", APP_ANDROID);

        driver = new AndroidDriver(Configs.kobitonServerUrl(), capabilities);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void testDualWebviews_Android() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

// get to dual webview screen and make sure it's loaded
        wait.until(ExpectedConditions.presenceOfElementLocated(hybridScreen)).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(webview));

// navigate to the webview context
        String webContext = getWebContext(driver);
        driver.context(webContext);

// go into each available window and get the text from the html page
        ArrayList<String> webviewTexts = new ArrayList<String>();
        for (String handle : driver.getWindowHandles()) {
            System.out.println(handle);
            driver.switchTo().window(handle);
            webviewTexts.add(driver.findElement(By.tagName("body")).getText());
        }
    }

    private String getWebContext(AppiumDriver driver) {
        ArrayList<String> contexts = new ArrayList(driver.getContextHandles());
        for (String context : contexts) {
            if (!context.equals("NATIVE_APP")) {
                return context;
            }
        }
        return null;
    }
}
