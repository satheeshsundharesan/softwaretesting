@Feature2
Feature: To validate the account creation facebook application
@Unity
Scenario: To create new account 
Given To launch the browser and maximise the window 
When  To launch url of fb application 
And  To click the create new account button 
# one dimensional map data  
And   To pass firstname in 	firstname text box
# key value
|firstname1|satheesh|
|firstname2|siva|
|firstname3|arunkumar|
And   To pass secondname in secondname text box
And   To pass mobilenumber or email in email text box
# two dimensional map data 
And  To create a new password using new password text box
|password|password1|password2|
|6477477466|fdtfygdygd|drdtfyg|
|tftfygydg|3947464|tfdyeydgu|
Then To close the Chrome browser 



 