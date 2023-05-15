$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Fbregistration.feature");
formatter.feature({
  "name": "To validate the account creation facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To create new account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Unity"
    }
  ]
});
formatter.step({
  "name": "To launch the browser and maximise the window",
  "keyword": "Given "
});
formatter.match({
  "location": "Fbregistration.to_launch_the_browser_and_maximise_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of fb application",
  "keyword": "When "
});
formatter.match({
  "location": "Fbregistration.to_launch_url_of_fb_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "Fbregistration.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in \tfirstname text box",
  "rows": [
    {
      "cells": [
        "firstname1",
        "satheesh"
      ]
    },
    {
      "cells": [
        "firstname2",
        "siva"
      ]
    },
    {
      "cells": [
        "firstname3",
        "arunkumar"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fbregistration.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "Fbregistration.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobilenumber or email in email text box",
  "keyword": "And "
});
formatter.match({
  "location": "Fbregistration.to_pass_mobilenumber_or_email_in_email_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To create a new password using new password text box",
  "rows": [
    {
      "cells": [
        "password",
        "password1",
        "password2"
      ]
    },
    {
      "cells": [
        "6477477466",
        "fdtfygdygd",
        "drdtfyg"
      ]
    },
    {
      "cells": [
        "tftfygydg",
        "3947464",
        "tfdyeydgu"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "Fbregistration.to_create_a_new_password_using_new_password_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the Chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fbregistration.to_close_the_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/sample.feature");
formatter.feature({
  "name": "To validate the login functionality of facbook appliction",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To validate login with valid username and  invalid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "To launch the chrome browser and maximize window",
  "keyword": "Given "
});
formatter.match({
  "location": "Fblog.to_launch_the_chrome_browser_and_maximize_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of the facbook application",
  "keyword": "When "
});
formatter.match({
  "location": "Fblog.to_launch_the_url_of_the_facbook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid username in email field",
  "keyword": "And "
});
formatter.match({
  "location": "Fblog.to_pass_valid_username_in_email_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass invalid  password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "Fblog.to_pass_invalid_password_in_password_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Fblog.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To check whether navigate to the home page or not",
  "keyword": "And "
});
formatter.match({
  "location": "Fblog.to_check_whether_navigate_to_the_home_page_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "Fblog.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.step({
  "name": "User has to get the facebook url",
  "keyword": "When "
});
formatter.step({
  "name": "User has to pass the data \"\u003cemaildatas\u003e\"in email field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to pass the data\"\u003cpassworddatas\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildatas",
        "passworddatas"
      ]
    },
    {
      "cells": [
        "satheesh30526@gmail.om",
        "9786157072"
      ]
    },
    {
      "cells": [
        "elavazhgan",
        "ellan"
      ]
    },
    {
      "cells": [
        "kalimanicivil",
        "87488499"
      ]
    },
    {
      "cells": [
        "arunkumar",
        "satheesh"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_has_to_get_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"satheesh30526@gmail.om\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data\"9786157072\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_has_to_get_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"elavazhgan\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data\"ellan\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_has_to_get_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"kalimanicivil\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data\"87488499\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate the postive and negative combination of login functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User has to launch the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "facebook.user_has_to_launch_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to get the facebook url",
  "keyword": "When "
});
formatter.match({
  "location": "facebook.user_has_to_get_the_facebook_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data \"arunkumar\"in email field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to pass the data\"satheesh\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_pass_the_data_in_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "facebook.user_has_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User has to close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "facebook.user_has_to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});