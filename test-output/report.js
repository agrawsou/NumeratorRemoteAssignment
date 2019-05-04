$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/USER/Project/DemoTest/Feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login test",
  "description": "",
  "id": "login-feature;login-test",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logins by using the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" as credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies that login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User selects the desired \"\u003caccount\u003e\" from the user accounts list",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User verifies that the selected \"\u003caccount\u003e\" exists in the database",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "login-feature;login-test;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "account"
      ],
      "line": 11,
      "id": "login-feature;login-test;;1"
    },
    {
      "cells": [
        "vishal.jadhav@numerator.com",
        "Test1234",
        "QA Testing - Promo"
      ],
      "line": 12,
      "id": "login-feature;login-test;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login test",
  "description": "",
  "id": "login-feature;login-test;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User logins by using the \"vishal.jadhav@numerator.com\" and \"Test1234\" as credentials",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User verifies that login is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User selects the desired \"QA Testing - Promo\" from the user accounts list",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User verifies that the selected \"QA Testing - Promo\" exists in the database",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "SampleStepDef.userOnLoginPage()"
});
formatter.result({
  "duration": 13309206291,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "vishal.jadhav@numerator.com",
      "offset": 26
    },
    {
      "val": "Test1234",
      "offset": 60
    }
  ],
  "location": "SampleStepDef.userLogin(String,String)"
});
formatter.result({
  "duration": 16797409719,
  "status": "passed"
});
formatter.match({
  "location": "SampleStepDef.verifyLogin()"
});
formatter.result({
  "duration": 9317178156,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA Testing - Promo",
      "offset": 26
    }
  ],
  "location": "SampleStepDef.selectAccount(String)"
});
formatter.result({
  "duration": 2822927015,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "QA Testing - Promo",
      "offset": 33
    }
  ],
  "location": "SampleStepDef.verifyAccountInDB(String)"
});
formatter.result({
  "duration": 349986539,
  "status": "passed"
});
formatter.after({
  "duration": 808682020,
  "status": "passed"
});
});