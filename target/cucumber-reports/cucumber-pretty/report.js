$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/tanumay123/Desktop/PRACTICE_ALL/MRScucumberFramework/src/main/java/com/cucumberframework/features/InpatientwardParameterisedDataTable.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#DataTable \u0026 Parameterised"
    }
  ],
  "line": 2,
  "name": "Login as a Inpatient Ward and Creation of New Service type.",
  "description": "",
  "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "click on Inpatient Ward.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Log In button.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user able to loged in to inpatient Ward as an Admin.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verifies user loged in to Inpatient ward.",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects Appointment Scheduling",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "selects Manage service Types",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on New Service Types",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enters name as \"\u003cService Test\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enters Duration as \"\u003cduration\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enters Description as \"\u003cdescribtion\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on Save button.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user verifies new creation of Service type.",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.;;",
  "rows": [
    {
      "cells": [
        "Service Test",
        "duration",
        "describtion"
      ],
      "line": 24,
      "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.;;;1"
    },
    {
      "cells": [
        "service test",
        "10",
        "testing"
      ],
      "line": 25,
      "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 6935718500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigate to \"https://demo.openmrs.org/openmrs/login.htm\".",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters username and password as",
  "rows": [
    {
      "cells": [
        "Admin",
        "Admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "https://demo.openmrs.org/openmrs/login.htm",
      "offset": 18
    }
  ],
  "location": "loginPageStepDefinations.user_navigate_to_something(String)"
});
formatter.result({
  "duration": 7438659900,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinations.user_enters_username_and_password_as(DataTable)"
});
formatter.result({
  "duration": 341825700,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "",
  "description": "",
  "id": "login-as-a-inpatient-ward-and-creation-of-new-service-type.;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "click on Inpatient Ward.",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "click on Log In button.",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "user able to loged in to inpatient Ward as an Admin.",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "verifies user loged in to Inpatient ward.",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user selects Appointment Scheduling",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "selects Manage service Types",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "click on New Service Types",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "enters name as \"service test\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "enters Duration as \"10\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "enters Description as \"testing\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on Save button.",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user verifies new creation of Service type.",
  "keyword": "Then "
});
formatter.match({
  "location": "loginPageStepDefinations.click_on_inpatient_ward()"
});
formatter.result({
  "duration": 126409400,
  "status": "passed"
});
formatter.match({
  "location": "loginPageStepDefinations.click_on_log_in_button()"
});
formatter.result({
  "duration": 4461995200,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.user_able_to_loged_in_to_inpatient_ward_as_an_admin()"
});
formatter.result({
  "duration": 4576200,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.verifies_user_loged_in_to_inpatient_ward()"
});
formatter.result({
  "duration": 129500,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.user_selects_appointment_scheduling()"
});
formatter.result({
  "duration": 3051062800,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.selects_manage_service_types()"
});
formatter.result({
  "duration": 3683876500,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.click_on_new_service_types()"
});
formatter.result({
  "duration": 1008513100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "service test",
      "offset": 16
    }
  ],
  "location": "InpatientwardStepDefinations.enters_name_as_something(String)"
});
formatter.result({
  "duration": 263122100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 20
    }
  ],
  "location": "InpatientwardStepDefinations.enters_duration_as_something(String)"
});
formatter.result({
  "duration": 151949800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testing",
      "offset": 23
    }
  ],
  "location": "InpatientwardStepDefinations.enters_description_as_something(String)"
});
formatter.result({
  "duration": 142501200,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.user_click_on_save_button()"
});
formatter.result({
  "duration": 1457911300,
  "status": "passed"
});
formatter.match({
  "location": "InpatientwardStepDefinations.user_verifies_new_creation_of_service_type()"
});
formatter.result({
  "duration": 254600,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1786889000,
  "status": "passed"
});
});