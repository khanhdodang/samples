package kobiton.com.clients;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.android.AndroidDriver;
import kobiton.com.configs.Configs;

public class OfficeDepot {
  public static AndroidDriver<WebElement> driver = null;

  public static final URL kobitonServerUrl(){
    try {
      String kobitonServerUrl = "https://pikachu:968bccd3-f872-4ab2-bd8f-96751514dad3@api.kobiton.com/wd/hub";
      return new URL(kobitonServerUrl);
    } catch (MalformedURLException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static final DesiredCapabilities desiredCapabilitiesAndroidApp(){
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("app", "kobiton-store:33350");
    capabilities.setCapability("deviceGroup", "ORGANIZATION");
    capabilities.setCapability("deviceName", "Pixel 2 XL");
    capabilities.setCapability("platformName", "Android");
    capabilities.setCapability("automationName", "UIAutomator2");
    capabilities.setCapability("udid", "712KPDT1142890");
    capabilities.setCapability("logLevel", "warn");
    capabilities.setCapability("autoGrantPermissions", true);
    capabilities.setCapability("appPackage", "com.officedepot.mobile.ui.sqm");
    capabilities.setCapability("appActivity", "com.officedepot.mobile.ui.MainActivity");
    return capabilities;
  }

  @Before
  public void Setup() {

    driver = new AndroidDriver<WebElement>(kobitonServerUrl(), desiredCapabilitiesAndroidApp());
    driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
  }

  @After
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
    driver.getPageSource();
  }

  public void sleep(int seconds) {
    try {
      Thread.sleep(seconds * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
