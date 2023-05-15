package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before
	private void precondition() {
		// precondition
		launchbrowser();
		windowsmaximize();
	}
	@After
	private void postcondition() {
		closeentirebroweser();

	}
	

}
