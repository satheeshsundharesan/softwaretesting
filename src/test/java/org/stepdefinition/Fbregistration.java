package org.stepdefinition;
import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.Siginpojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbregistration extends BaseClass {
	
	Siginpojo S;
	@Given("To launch the browser and maximise the window")
	public void to_launch_the_browser_and_maximise_the_window() {
		launchbrowser();
	   windowsmaximize();
	}
	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
		launuchurl("https://en-gb.facebook.com/");
	   
	}
	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		S =new Siginpojo();
		clickbtn(S.getCreatenew());
	   
	}

	@When("To pass firstname in 	firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		
		Map<Object, Object> map = d.asMap(String.class, String.class);
		S =new Siginpojo();
		passtext((String) map.get("firstname1"), S.getFirstname());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
		S =new Siginpojo();
		passtext("siva", S.getLastname());
	    
	}
	@When("To pass mobilenumber or email in email text box")
	public void to_pass_mobilenumber_or_email_in_email_text_box() throws InterruptedException {
		S=new Siginpojo();
		passtext( "satheesh30526@gmil.com",S.getMobileoremail() );
		Thread.sleep(3000);	   
	}

	@When("To create a new password using new password text box")
	public void to_create_a_new_password_using_new_password_text_box(DataTable d) {
		List<Map<String, String>> map = d.asMaps();
		
		S=new Siginpojo();
		passtext(map.get(1).get("password1"), S.getPasswordtext());
	  
	}

	@Then("To close the Chrome browser")
	public void to_close_the_Chrome_browser() {
		closeentirebroweser();
	   
	}


}
