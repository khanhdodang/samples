$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test_android_app.feature");
formatter.feature({
  "name": "Test iFixit application on Android device",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@androidApp"
    },
    {
      "name": "@app"
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
      "name": "@androidApp"
    },
    {
      "name": "@app"
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
  "location": "Android_app.start_an_android_app_session()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "End session",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@androidApp"
    },
    {
      "name": "@app"
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
  "location": "Android_app.end_an_android_app_session()"
});
formatter.result({
  "status": "passed"
});
});