package org.pojo;

import org.base.BaseClass;

public class Pageclass extends BaseClass {
	public static void main(String[] args) {
		launchbrowser();
		launuchurl("https://www.facebook.com/");
		windowsmaximize();
		Fblogin fb=new Fblogin();
		passtext("satheesh", fb.getEmail());
		passtext("siva", fb.getPassword());
		
		driver.navigate().refresh();
		passtext("arunkumar", fb.getEmail());
		passtext("satheesh", fb.getPassword());
		clickbtn(fb.getLoginpage());
		
		
	
		
		
	}
	

}
