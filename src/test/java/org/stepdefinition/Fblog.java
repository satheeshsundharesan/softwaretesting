package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.Fblogin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fblog extends BaseClass {
	Fblogin fb  ;
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() { 
		launchbrowser();
		windowsmaximize();
	}

	@When("To launch the url of the facbook application")
	public void to_launch_the_url_of_the_facbook_application() {
		
		launuchurl("https://en-gb.facebook.com/");
	   
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {  
		fb=new Fblogin();
		passtext("satheesh30526@gmail.com", fb.getEmail());
	}

	@When("To pass invalid  password in password field")
	public void to_pass_invalid_password_in_password_field() { 
		 fb=new Fblogin();
		passtext("5t6t788", fb.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		fb=new Fblogin();
		clickbtn(fb.getLoginpage());
		
		
	}
	   
	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {   
		System.out.println("to check your login crdeentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {   
		closeentirebroweser();
	}
	

}
