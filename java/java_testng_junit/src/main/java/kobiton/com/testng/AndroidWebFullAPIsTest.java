package kobiton.com.testng;

import io.appium.java_client.*;
import io.appium.java_client.android.*;
import io.appium.java_client.clipboard.ClipboardContentType;
import io.appium.java_client.screenrecording.BaseStartScreenRecordingOptions;
import io.appium.java_client.screenrecording.ScreenRecordingUploadOptions;
import io.appium.java_client.touch.offset.PointOption;
import kobiton.com.configs.Configs;
import org.openqa.selenium.*;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class AndroidWebFullAPIsTest {
	public static AndroidDriver<WebElement> driver = null;
	String authenticationUrl = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	String emailCreateText = "#email_create";
	String createAnAccountButton = "#SubmitCreate";
	String authenticationError = "#create_account_error";
	String searchText = "#search_query_top";
	String searchButton = "#searchbox > button";

	// Create an account screen
	String pageHeading = ".page-heading";
	String tagForm = "form";
	String creatAccountHeader = "//*[@id='noSlide']/h1";
	String genderOptionMr = "//*[@id='id_gender1']";
	String genderOptionMrs = "#id_gender2";
	String customerFirstNameText = "//*[@id='customer_firstname']";
	String customerLastNameText = "//*[@id='customer_lastname']";
	String passwordText = "//*[@id='passwd']";
	String email = "//*[@id='email']";
	String dateOfBirthDiv = "//*[@id='uniform-days']";
	String dateOfBirthSelect = "//*[@id='days']";
	String monthOfBirthSelect = "//*[@id='months']";
	String yearOfBirthSelect = "//*[@id='years']";
	String newsLetterCheckbox = "//*[@id='newsletter']";
	String specialOfferCheckbox = "//*[@id='optin']";
	String lastNameText = "//*[@id='lastname']";
	String additionalInformationText = "//*[@id='other']";
	String companyText = "//*[@id='company']";
	String firstAddressText = "//*[@id='address1']";
	String secondAddressText = "//*[@id='address2']";
	String cityText = "//*[@id='city']";
	String stateSelect = "//*[@id='id_state']";
	String zipCodeText = "//*[@id='postcode']";
	String mobilePhoneText = "#phone_mobile";
	String accountCreationForm = "//*[@id='account-creation_form']";
	String registerButton = "//*[@id='submitAccount']";
	String registerError = "//*[@id='center_column']/div";

	public static final URL kobitonServerUrl(){
		try {
			return new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			e.getMessage();
		}
		return null;
	}

	public static final DesiredCapabilities desiredCapabilitiesAndroidWeb(){
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("deviceName", "U11");
		capabilities.setCapability("platformName", "Android");
		return capabilities;
	}

	@BeforeTest
	public void Setup() {
		driver = new AndroidDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesAndroidApp());
//		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
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
		driver.get(authenticationUrl);
		driver.getTitle();
		driver.getSessionDetail("demo");
		driver.getCapabilities();
		driver.getSessionDetails();
		driver.getSessionId();
		driver.getAutomationName();
		driver.getCommandExecutor();
		driver.getConnection();

		driver.getCurrentUrl();
		driver.getSupportedPerformanceDataTypes();
		driver.getErrorHandler();
		driver.getFileDetector();

		driver.resetInputState();
		driver.getDisplayDensity();
		driver.getPlatformName();
		driver.getRemoteAddress();
		driver.getDisplayDensity();
		driver.getExecuteMethod();

		driver.isAppInstalled("com.android.chrome");
		driver.isBrowser();


	}

	@Test
	public void ElementEndpoints() {
		driver.getPageSource();
		WebElement ele = driver.findElementByClassName("logo img-responsive");
		ele.clear();
		ele.sendKeys("Printed Chiffon Dress");
		ele.getText();
		ele.getSize();
		ele.getTagName();
		ele.getAttribute("type");
		ele.getAttribute("class");
		ele.getAttribute("name");
		ele.getAttribute("style");
		ele.getAttribute("value");
		ele.getAttribute("id");
		ele.getAttribute("autocomplete");
		ele.getAttribute("placeholder");
		ele.getAttribute("content-desc");
		ele.isDisplayed();
		ele.isEnabled();
		ele.isSelected();
		ele.getLocation();
		ele.getRect();
		ele.getCssValue("style");

		driver.findElement(By.id("authentication"));
		driver.findElement(By.id("searchbox")).submit();
		sleep(5000);

		WebElement ele1 = driver.findElement(By.className("login"));
		WebElement ele2 = driver.findElement(By.name("orderby"));
		ele1.equals(ele2);

		driver.findElement(By.xpath(customerFirstNameText));
		driver.findElement(By.tagName("tagname"));
		driver.findElement(By.linkText("Contact us"));
		driver.findElement(By.partialLinkText("http://automationpractice.com/index.php?controller=contact"));
		driver.findElementsByClassName(searchText);
		WebElement currentElement = driver.switchTo().activeElement();
	}

	@Test
	public void ContextEndpoints() {
		String context = driver.getContext();
		Set<String> contextNames = driver.getContextHandles();
		driver.context(contextNames.toArray()[1].toString());
		driver.context("NATIVE_APP");
	}

	@Test
	public void WindowEndpoints() {
		try {
			driver.switchTo().window("handle");
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			driver.close();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			String windowHandle = driver.getWindowHandle();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			Set<String> windowHandles = driver.getWindowHandles();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			Dimension windowSize = driver.manage().window().getSize();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			driver.manage().window().setSize(new Dimension(10, 10));
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			Point windowPosition = driver.manage().window().getPosition();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			driver.manage().window().setPosition(new Point(10, 10));
		} catch (Exception ex) {
			ex.getMessage();
		}


		try {
			driver.manage().window().maximize();
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	@Test
	public void FrameEndpoints() {
		try {
			driver.switchTo().frame(3);
			driver.switchTo().parentFrame();
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	@Test
	public void ExecuteAsyncScriptEndpoints() {
		try {
			((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		} catch (Exception ex) {
			ex.getMessage();
		}
		try {
			((JavascriptExecutor) driver).executeScript("window.setTimeout(arguments[arguments.length - 1], 500);");
		} catch (Exception ex) {
			ex.getMessage();
		}
	}

	@Test
	public void SessionEndpoints() {
		// http://appium.io/docs/en/commands/session/get/index.html
		Map<String, Object> caps = driver.getSessionDetails();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		driver.getScreenshotAs(OutputType.BASE64);
		driver.getPageSource();
		driver.getOrientation();
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.rotate(ScreenOrientation.PORTRAIT);
	}

	@Test
	public void CookiesEndpoints() {
		try {
			driver.manage().deleteAllCookies();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			driver.manage().addCookie(new Cookie("foo", "bar"));
			Set<Cookie> allcookies = driver.manage().getCookies();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			driver.manage().deleteCookieNamed("foo");
			driver.manage().deleteAllCookies();
		} catch (Exception ex) {
			ex.getMessage();
		}

	}

	@Test
	public void ClipboardEndpoints() {
		byte[] base64Content = "hello world".getBytes();
		try {
			driver.setClipboard("label", ClipboardContentType.PLAINTEXT, base64Content);
			driver.getClipboardText();
		} catch (Exception ex){
			ex.getMessage();
		}

		try {
			driver.setClipboard( ClipboardContentType.PLAINTEXT, base64Content);
			driver.getClipboardText();
		} catch (Exception ex){
			ex.getMessage();
		}

		try {
			driver.setClipboardText("label", "happy testing 1");
			driver.getClipboardText();
		} catch (Exception ex){
			ex.getMessage();
		}

		try {
			driver.setClipboardText("happy testing 2");
			driver.getClipboardText();
		} catch (Exception ex){
			ex.getMessage();
		}

		try {
			driver.getClipboard(ClipboardContentType.PLAINTEXT);
			driver.getClipboard(ClipboardContentType.IMAGE);
			driver.getClipboard(ClipboardContentType.URL);
			driver.getClipboard(ClipboardContentType.valueOf("hello world"));
		} catch (Exception ex){
			ex.getMessage();
		}
	}

	@Test
	public void InteractionsEndpoints() {
		driver.lockDevice();
		driver.unlockDevice();
		boolean isLocked = driver.isDeviceLocked();

		Actions action = new Actions(driver);

		try {
			action.moveByOffset(10, 10);
			action.click();
			action.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			action.moveToElement(driver.findElementById(emailCreateText), 10, 10);
			action.click(driver.findElementById(emailCreateText));
			action.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}

		try {
			action.moveToElement(driver.findElementById(emailCreateText));
			action.doubleClick();
			action.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}


		try {
			action.moveToElement(driver.findElementByCssSelector(searchButton));
			action.clickAndHold();
			action.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}


		try {
			action.moveToElement(driver.findElementById(emailCreateText));
			action.clickAndHold();
			action.moveToElement(driver.findElementById(emailCreateText), 10, 10);
			action.release();
			action.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}

		TouchActions touchActions = new TouchActions(driver);
		try {
			touchActions.singleTap(driver.findElement(By.xpath(email)));
			touchActions.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}


		try {
			touchActions.doubleTap(driver.findElement(By.xpath(email)));
			touchActions.perform();
		} catch (Exception ex) {
			ex.getMessage();
		}


		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		touchActions = new TouchActions(driver);
		touchActions.down(10, 10);
		touchActions.move(50, 50);
		touchActions.perform();

		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		touchActions = new TouchActions(driver);
		touchActions.down(10, 10);
		touchActions.up(50, 50);
		touchActions.perform();

		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		touchActions = new TouchActions(driver);
		touchActions.longPress(driver.findElement(By.xpath(lastNameText)));
		touchActions.perform();

		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		touchActions = new TouchActions(driver);
		touchActions.scroll(driver.findElement(By.xpath(lastNameText)), 10, 10);
		touchActions.perform();

		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		touchActions = new TouchActions(driver);
		touchActions.flick(driver.findElement(By.xpath(lastNameText)), 1,10, 10);
		touchActions.perform();

		try {

		} catch (Exception ex) {
			ex.getMessage();
		}
		TouchAction actionOne = new TouchAction(driver);
		actionOne.moveTo(PointOption.point(10, 10));
		actionOne.release();
		TouchAction actionTwo = new TouchAction(driver);
		actionOne.moveTo(PointOption.point(10, 10));
		actionTwo.release();
		MultiTouchAction multiTouchAction = new MultiTouchAction(driver);
		multiTouchAction.add(actionOne);
		multiTouchAction.add(actionTwo);
		action.perform();


	}

	@Test
	public void RecordingScreenEndpoints() {
		driver.startRecordingScreen();

		sleep(5000);
		String result = driver.stopRecordingScreen();


	}

	@Test
	public void KeysEndpoints() {
		driver.pressKeyCode(AndroidKeyCode.SPACE, AndroidKeyMetastate.META_SHIFT_ON);
		driver.longPressKeyCode(AndroidKeyCode.HOME);
		driver.getKeyboard();
		driver.isKeyboardShown();
		driver.hideKeyboard();
	}

	@Test
	public void NetworkEndpoints() {
		try {
			driver.toggleAirplaneMode();
		} catch (Exception ex) {
			ex.getMessage();
		}

		driver.toggleData();
		driver.toggleWifi();
		driver.toggleLocationServices();
		driver.sendSMS("555-123-4567", "Hey lol");
		driver.makeGsmCall("5551234567", GsmCallActions.CALL);
		driver.setGsmSignalStrength(GsmSignalStrength.GOOD);
		driver.setGsmVoice(GsmVoiceState.HOME);
	}

	@Test
	public void PerformanceDataEndpoints() {
		try {
			List<List<Object>> performanceData = driver.getPerformanceData("com.android.chrome", "cpuinfo", 5);
			System.out.println("PerformanceDataEndpoints" + performanceData);
			List<String> performanceTypes = driver.getSupportedPerformanceDataTypes();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	@Test
	public void EmulatorEndpoints() {
		try {
			driver.setPowerCapacity(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			driver.setPowerAC(PowerACState.OFF);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			driver.setPowerAC(PowerACState.ON);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void FilesEndpoints() {
		try {
			driver.pushFile("/path/to/device/foo.bar", new File("/Users/(whoami)/files/foo.bar"));
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			byte[] fileBase64 = driver.pullFile("/path/to/device/foo.bar");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		try {
			byte[] folder = driver.pullFolder("/path/to/device/foo.bar");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void NavigationEndpoints() {
		driver.get("http://appium.io/");
		String url = driver.getCurrentUrl();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.get(authenticationUrl);
	}

	@Test
	public void GeolocationEndpoints() {
		driver.setLocation(new Location(49, 123, 10));
		Location location = driver.location();
	}

	@Test
	public void LogsEndpoints() {
		Set<String> logTypes = driver.manage().logs().getAvailableLogTypes();
		System.out.println("LogsEndpoints: " + logTypes);
		driver.manage().logs().get("logcat");
		driver.manage().logs().get("bugreport");
		driver.manage().logs().get("server");
		driver.manage().logs().get("client");
	}

	@Test
	public void SettingsEndpoints() {
		driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 60);
		Map<String, Object> settings = driver.getSettings();
	}

	@Test
	public void SystemEndpoints() {
		driver.openNotifications();
		try {
			Map<String, String> systemBars = driver.getSystemBars();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		try {
			String time = driver.getDeviceTime();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Test
	public void FingerprintEndpoints() {
		try {
			driver.fingerPrint(1);
		} catch (Exception ex) {
			ex.getMessage();
		}
	}
//
//	@BeforeTest
//	public void Setup() {
//		driver = new AndroidDriver<WebElement>(Configs.kobitonServerUrl(), Configs.desiredCapabilitiesAndroidWeb());
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
//		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
//	}
//
//	@AfterTest
//	public void Teardown() {
//		try {
//			if (driver != null)
//				driver.quit();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
