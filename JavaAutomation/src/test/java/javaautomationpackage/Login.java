package javaautomationpackage;

import org.testng.annotations.Test;

public class Login {
	ConfigBrowsers InitiateDriver = new ConfigBrowsers();
	BasePage LoginMyApp = new BasePage();
	
//Browse Pegasus Application
  @Test
  public void AOpeningBrowser() {
	  
	InitiateDriver.LaunchBrowser();
  }
 //Login to Application
  @Test
  public void BApplicationLogin()
  {
	  //Login application
	LoginMyApp.InsertTextById("loginname", "demoinstructor");
	LoginMyApp.InsertTextById("password", "Password1");
	LoginMyApp.ClickOnLinkByClassName("lgn_btn");  
  }
}
