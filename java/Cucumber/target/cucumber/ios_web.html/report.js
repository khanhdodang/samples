$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test_ios_web.feature");
formatter.feature({
  "name": "Login in heroku page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@iosWeb"
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
      "name": "@iosWeb"
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
  "name": "User starts a session on iOS device",
  "keyword": "Given "
});
formatter.match({
  "location": "Ios_web.start_an_ios_web_session()"
});
formatter.result({
  "error_message": "org.openqa.selenium.SessionNotCreatedException: socket hang up\nCommand duration or timeout: 120.95 seconds\nBuild info: version: \u00273.6.0\u0027, revision: \u00276fbf3ec767\u0027, time: \u00272017-09-27T15:28:36.4Z\u0027\nSystem info: host: \u0027KhanhDo.local\u0027, ip: \u0027fe80:0:0:0:14d8:a15d:87ca:f26d%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.14.6\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: IOSDriver\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\n\tat org.openqa.selenium.remote.Gecko013ProtocolResponse.lambda$new$0(Gecko013ProtocolResponse.java:39)\n\tat org.openqa.selenium.remote.Gecko013ProtocolResponse.lambda$getResponseFunction$2(Gecko013ProtocolResponse.java:90)\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$24(ProtocolHandshake.java:359)\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:362)\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:136)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:142)\n\tat io.appium.java_client.remote.AppiumCommandExecutor.execute(AppiumCommandExecutor.java:89)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:586)\n\tat io.appium.java_client.DefaultGenericMobileDriver.execute(DefaultGenericMobileDriver.java:42)\n\tat io.appium.java_client.AppiumDriver.execute(AppiumDriver.java:1)\n\tat io.appium.java_client.ios.IOSDriver.execute(IOSDriver.java:1)\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:217)\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:140)\n\tat io.appium.java_client.DefaultGenericMobileDriver.\u003cinit\u003e(DefaultGenericMobileDriver.java:38)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:83)\n\tat io.appium.java_client.AppiumDriver.\u003cinit\u003e(AppiumDriver.java:93)\n\tat io.appium.java_client.ios.IOSDriver.\u003cinit\u003e(IOSDriver.java:78)\n\tat iosWeb.Ios_web.start_an_ios_web_session(Ios_web.java:17)\n\tat ✽.User starts a session on iOS device(src/test/resources/features/Test_ios_web.feature:5)\n",
  "status": "failed"
});
formatter.scenario({
  "name": "End session",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@iosWeb"
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
formatter.match({});
formatter.result({
  "status": "undefined"
});
});