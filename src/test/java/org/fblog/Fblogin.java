

package org.fblog;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fblogin extends BaseClass {
	// non parametrized constructor
	public Fblogin() {
		PageFactory.initElements(driver, this);
		
	}
	// private elements 
		@FindBy(id="email")
		private WebElement email;
		
		@FindBy(xpath="//input[@type='password']")
		private WebElement password;
		
		@FindBy(name="login")
		private WebElement loginpage;
		// getter to access webelement outside the class

		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLoginpage() {
			return loginpage;
		}

}
