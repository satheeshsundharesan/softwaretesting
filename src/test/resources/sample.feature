@Feature1
Feature: To validate the login functionality of facbook appliction 
@Sanity
Scenario: To validate login with valid username and  invalid password
Given To launch the chrome browser and maximize window 
When  To launch the url of the facbook application 
And To pass valid username in email field
And To pass invalid  password in password field 
And To click the login button 
And To check whether navigate to the home page or not 
Then To close the browser 
@Regression
Scenario Outline: To validate the postive and negative combination of login functionality
Given User has to launch the browser and maximize the window 
When  User has to get the facebook url 
And  User has to pass the data "<emaildatas>"in email field 
And User has to pass the data"<passworddatas>" in password field 
And User has to click login button
Then User has to close the browser

Examples:
|emaildatas|passworddatas|
|satheesh30526@gmail.om|9786157072|
|elavazhgan|ellan|
|kalimanicivil|87488499|
|arunkumar|satheesh|



















