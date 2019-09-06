package kobiton.com.clients;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.appium.java_client.ios.IOSDriver;
import kobiton.com.configs.Configs;

public class qvc {

    public static  IOSDriver driver = null;

    @BeforeTest
    public void Setup() {
        URL url = null;
        try {
//            String kobitonServerUrl = "https://khanhdo:7c3fa781-3fa3-43e9-8dfd-294509985d05@api-test.kobiton.com/wd/hub";
            String kobitonServerUrl = "https://pikachu:968bccd3-f872-4ab2-bd8f-96751514dad3@api.kobiton.com/wd/hub";

            url = new URL(kobitonServerUrl);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("sessionName", "qvc");
        capabilities.setCapability("sessionDescription", "This is an example for iOS App testing");
        capabilities.setCapability("deviceOrientation", "portrait");
        capabilities.setCapability("captureScreenshots", true);
        capabilities.setCapability("app", "https://s3-ap-southeast-1.amazonaws.com/kobiton-devvn/demo/qvc_iphone_us_checkout.ipa");
        capabilities.setCapability("deviceGroup", "ORGANIZATION");
        capabilities.setCapability("deviceName", "*");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("newCommandTimeout", 120);
//        capabilities.setCapability("udid", "0e85c2bbf27377f8af08a871bef38f110fc1b6e0");
        capabilities.setCapability("connectHardwareKeyboard", true);
        driver = new IOSDriver<WebElement>(url, capabilities);

//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
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

    @Test
    public void test() {

        sleep(10);
//
        Dimension size =  ((IOSDriver<WebElement>)driver).manage().window().getSize();

        System.out.println("getHeight" + size.getHeight());
        System.out.println("getWidth" + size.getWidth());
        try{
            driver.findElement(By.id("OK")).click();
            size =  ((IOSDriver<WebElement>)driver).manage().window().getSize();

            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
        }catch (Exception ex){

        }


        try{
            driver.findElement(By.id("Allow")).click();
            size =  ((IOSDriver<WebElement>)driver).manage().window().getSize();

            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
        }catch (Exception ex){

        }

        try{
            driver.findElement(By.id("Home")).click();

            size = driver.manage().window().getSize();
            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
        }catch (Exception ex){

        }

        try{
            driver.findElement(By.id("Cart")).click();
            size = driver.manage().window().getSize();
            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
            driver.findElement(By.id("Close the Cart Page")).click();
            size = driver.manage().window().getSize();
            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
            driver.findElement(By.id("More")).click();
            size = driver.manage().window().getSize();
            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
            driver.findElement(By.id("Close the Cart Page")).click();
            size = driver.manage().window().getSize();
            System.out.println("getHeight" + size.getHeight());
            System.out.println("getWidth" + size.getWidth());
        }catch (Exception ex){

        }
//        Map<String, Object> params = new HashMap<String, Object>();
//        params.put("bundleId", "com.myapp");
//        final boolean wasRunningBefore = (Boolean)js.executeScript("mobile: terminateApp", params);

    }

    public void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
