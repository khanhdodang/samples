$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test_android_web.feature");
formatter.feature({
  "name": "Login in heroku page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.scenario({
  "name": "Open session",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.step({
  "name": "User starts a session on android device",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_web.start_an_android_web_session()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Verify login with invalid username",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User go to login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User inputs username \u003cusername\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User inputs password \u003cpassword\u003e",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.step({
  "name": "User will see message \u003cerrorMessage\u003e",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "errorMessage"
      ]
    },
    {
      "cells": [
        "foo",
        "SuperSecretPassword!",
        "Your username is invalid!"
      ]
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword",
        "Your password is invalid!"
      ]
    },
    {
      "cells": [
        "tomsmith",
        "SuperSecretPassword!",
        "You logged into a secure area!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify login with invalid username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.step({
  "name": "User go to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_web.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs username foo",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_username(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Returned value cannot be converted to WebElement: {ELEMENT\u003d0.5726839745651053-1}\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027KhanhDo.local\u0027, ip: \u0027fe80:0:0:0:14d8:a15d:87ca:f26d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: AndroidDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat ✽.User inputs username foo(src/test/resources/features/Test_android_web.feature:9)\nCaused by: java.lang.ClassCastException: java.util.HashMap cannot be cast to org.openqa.selenium.WebElement\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.step({
  "name": "User inputs password SuperSecretPassword!",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.click_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will see message Your username is invalid!",
  "keyword": "Then "
});
formatter.match({
  "location": "Android_web.verify_login_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify login with invalid username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.step({
  "name": "User go to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_web.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs username tomsmith",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_username(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Returned value cannot be converted to WebElement: {ELEMENT\u003d0.5487296371596293-1}\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027KhanhDo.local\u0027, ip: \u0027fe80:0:0:0:14d8:a15d:87ca:f26d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: AndroidDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat ✽.User inputs username tomsmith(src/test/resources/features/Test_android_web.feature:9)\nCaused by: java.lang.ClassCastException: java.util.HashMap cannot be cast to org.openqa.selenium.WebElement\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.step({
  "name": "User inputs password SuperSecretPassword",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.click_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will see message Your password is invalid!",
  "keyword": "Then "
});
formatter.match({
  "location": "Android_web.verify_login_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verify login with invalid username",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.step({
  "name": "User go to login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_web.go_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User inputs username tomsmith",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_username(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: Returned value cannot be converted to WebElement: {ELEMENT\u003d0.5101166605354204-1}\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027KhanhDo.local\u0027, ip: \u0027fe80:0:0:0:14d8:a15d:87ca:f26d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: AndroidDriver\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:363)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat ✽.User inputs username tomsmith(src/test/resources/features/Test_android_web.feature:9)\nCaused by: java.lang.ClassCastException: java.util.HashMap cannot be cast to org.openqa.selenium.WebElement\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:361)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:62)\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElement(AndroidDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:402)\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElementById(DefaultGenericMobileDriver.java:70)\n\tat io.appium.java_client.AppiumDriver.findElementById(AppiumDriver.java:1)\n\tat io.appium.java_client.android.AndroidDriver.findElementById(AndroidDriver.java:1)\n\tat androidWeb.Android_web.input_username(Android_web.java:43)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:498)\n\tat cucumber.runtime.Utils$1.call(Utils.java:32)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\n\tat cucumber.runtime.Utils.invoke(Utils.java:26)\n\tat cucumber.runtime.java.JavaStepDefinition.execute(JavaStepDefinition.java:37)\n\tat cucumber.runtime.StepDefinitionMatch.runStep(StepDefinitionMatch.java:40)\n\tat cucumber.api.TestStep.executeStep(TestStep.java:102)\n\tat cucumber.api.TestStep.run(TestStep.java:83)\n\tat cucumber.api.TestCase.run(TestCase.java:58)\n\tat cucumber.runner.Runner.runPickle(Runner.java:80)\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:117)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:126)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:137)\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\n",
  "status": "failed"
});
formatter.step({
  "name": "User inputs password SuperSecretPassword!",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.input_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks login button",
  "keyword": "And "
});
formatter.match({
  "location": "Android_web.click_Login()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will see message You logged into a secure area!",
  "keyword": "Then "
});
formatter.match({
  "location": "Android_web.verify_login_message(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "End session",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@androidWeb"
    },
    {
      "name": "@web"
    },
    {
      "name": "@demoCucumber"
    }
  ]
});
formatter.step({
  "name": "User ends session on Android device",
  "keyword": "Given "
});
formatter.match({
  "location": "Android_web.end_an_android_web_session()"
});
formatter.result({
  "status": "passed"
});
});