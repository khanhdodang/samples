$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Test_ios_app.feature");
formatter.feature({
  "name": "Test iFixit application on ios device",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@iosApp"
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
      "name": "@iosApp"
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
  "name": "User starts a session on ios device",
  "keyword": "Given "
});
formatter.match({
  "location": "Ios_app.start_an_ios_app_session()"
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
      "name": "@iosApp"
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
  "name": "User ends session on ios device",
  "keyword": "Given "
});
formatter.match({
  "location": "Ios_app.end_an_ios_app_session()"
});
formatter.result({
  "status": "passed"
});
});