package tests;

import steps.WebElementSteps;

public class WebElementTest {

	public static void main(String[] args) throws Exception {
		
		WebElementSteps objWebElementSteps=new WebElementSteps();
		objWebElementSteps.LaunchBrowser();
		objWebElementSteps.openApplication();
		objWebElementSteps.allMethodsOfWebElement();
		objWebElementSteps.closeBrowser();
		
	}

}
