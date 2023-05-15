package org.pojo;

import javax.management.loading.PrivateClassLoader;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Siginpojo extends BaseClass {
	public Siginpojo() {
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath = "//a[text()='Create new account']")
		private WebElement createnew; 
		
		@FindBy(xpath = "(//input[@type='text'])[2]")
		private WebElement firstname;
		
		@FindBy(name = "lastname")
		private WebElement lastname;
		
		@FindBy(xpath = "(//input[@type='text'])[4]")
		private WebElement mobileoremail;
		
		@FindBy(xpath = "(//input[@type='password'])[2]")
		private WebElement passwordtext;

		public WebElement getCreatenew() {
			return createnew;
		}

		public void setCreatenew(WebElement createnew) {
			this.createnew = createnew;
		}

		public WebElement getFirstname() {
			return firstname;
		}

		public void setFirstname(WebElement firstname) {
			this.firstname = firstname;
		}

		public WebElement getLastname() {
			return lastname;
		}

		public void setLastname(WebElement lastname) {
			this.lastname = lastname;
		}

		public WebElement getMobileoremail() {
			return mobileoremail;
		}

		public void setMobileoremail(WebElement mobileoremail) {
			this.mobileoremail = mobileoremail;
		}

		public WebElement getPasswordtext() {
			return passwordtext;
		}

		public void setPasswordtext(WebElement passwordtext) {
			this.passwordtext = passwordtext;
		}
		
}
