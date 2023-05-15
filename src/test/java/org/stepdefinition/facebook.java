package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.Fblogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class facebook extends BaseClass {
	
Fblogin fb;
@Given("User has to launch the browser and maximize the window")
public void user_has_to_launch_the_browser_and_maximize_the_window() {
	launchbrowser();
	windowsmaximize();
   
}

@When("User has to get the facebook url")
public void user_has_to_get_the_facebook_url() {
    launuchurl("https://en-gb.facebook.com/");
}

@When("User has to pass the data {string}in email field")
public void user_has_to_pass_the_data_in_email_field(String email) {
	fb=new Fblogin();
	passtext(email, fb.getEmail());
   
}

@When("User has to pass the data{string} in password field")
public void user_has_to_pass_the_data_in_password_field(String pass) {
	fb=new Fblogin();
	passtext(pass, fb.getPassword());
    
}

@When("User has to click login button")
public void user_has_to_click_login_button() {
	fb=new Fblogin();
	clickbtn(fb.getLoginpage());
   
}

@Then("User has to close the browser")
public void user_has_to_close_the_browser() {
	closeentirebroweser();
   
}

	

}




