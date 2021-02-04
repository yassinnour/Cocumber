$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5812972400,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "login;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "valid user",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user goes to Techfios webSite",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user should be landed in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user logs in with valid username \"demo@techfios.com\" password \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.valid_user()"
});
formatter.result({
  "duration": 2523822900,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_goes_to_Techfios_webSite()"
});
formatter.result({
  "duration": 1885888300,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.user_should_be_landed_in_login_page()"
});
formatter.result({
  "duration": 98231400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 34
    },
    {
      "val": "abc123",
      "offset": 63
    }
  ],
  "location": "Loginsteps.user_logs_in_with_valid_username_password(String,String)"
});
formatter.result({
  "duration": 2328045500,
  "status": "passed"
});
formatter.match({
  "location": "Loginsteps.the_Dashboard_page_should_display()"
});
formatter.result({
  "duration": 3183203400,
  "status": "passed"
});
formatter.after({
  "duration": 2882101300,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 11,
  "name": "C002  Users would be able to add new account",
  "description": "",
  "id": "login;c002--users-would-be-able-to-add-new-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "a user already logged in as \"\u003cuserName\u003e\" and \"\u003cpassWord\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user submits \"\u003ctitle\u003e\", \"\u003cdescription\u003e\" and \"\u003cbalance\u003e\"\"\u003caccountNumber\u003e\" \"\u003ccontact\u003e\"\"\u003cphone\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login;c002--users-would-be-able-to-add-new-account;",
  "rows": [
    {
      "cells": [
        "userName",
        "passWord",
        "title",
        "description",
        "balance",
        "accountNumber",
        "contact",
        "phone"
      ],
      "line": 19,
      "id": "login;c002--users-would-be-able-to-add-new-account;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "TestAccount",
        "Saving",
        "999",
        "567890",
        "Nour",
        "555577777"
      ],
      "line": 20,
      "id": "login;c002--users-would-be-able-to-add-new-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7146945500,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "C002  Users would be able to add new account",
  "description": "",
  "id": "login;c002--users-would-be-able-to-add-new-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 12,
  "name": "a user already logged in as \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user navigate to Bank Cash -\u003e New Account Page",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "New Accounts Page should display",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user submits \"TestAccount\", \"Saving\" and \"999\"\"567890\" \"Nour\"\"555577777\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "created account should be posted",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 29
    },
    {
      "val": "abc123",
      "offset": 53
    }
  ],
  "location": "AddNewAccountSteps.a_user_already_logged_in_as_and(String,String)"
});
formatter.result({
  "duration": 2573371600,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountSteps.user_navigate_to_Bank_Cash_New_Account_Page()"
});
formatter.result({
  "duration": 5865649000,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountSteps.new_Accounts_Page_should_display()"
});
formatter.result({
  "duration": 119781000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "TestAccount",
      "offset": 14
    },
    {
      "val": "Saving",
      "offset": 29
    },
    {
      "val": "999",
      "offset": 42
    },
    {
      "val": "567890",
      "offset": 47
    },
    {
      "val": "Nour",
      "offset": 56
    },
    {
      "val": "555577777",
      "offset": 62
    }
  ],
  "location": "AddNewAccountSteps.user_submits_and(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 4130402300,
  "status": "passed"
});
formatter.match({
  "location": "AddNewAccountSteps.created_account_should_be_posted()"
});
formatter.result({
  "duration": 25500,
  "status": "passed"
});
formatter.after({
  "duration": 2968737900,
  "status": "passed"
});
});