package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void printKobitonSessionId(AndroidDriver<WebElement> driver) {
        String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
        System.out.println("https://portal-test.kobiton.com/sessions/" + kobitonSessionId);
    }

    public static void printKobitonSessionId(IOSDriver<WebElement> driver) {
        String kobitonSessionId = driver.getCapabilities().getCapability("kobitonSessionId").toString();
        System.out.println("https://portal-test.kobiton.com/sessions/" + kobitonSessionId);
    }
}
