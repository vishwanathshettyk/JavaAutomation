package pegasusAutomationscripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pegasusAutomationCommonPages.BasePage;
import pegasusAutomationCommonPages.ConfigBrowsers;

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
  @Parameters({"loginElement","username"})
  public void BEnterUesrName(String loginElement, String username )
  {
	  //Enter User name
	  	LoginMyApp.InsertTextById(loginElement,username);
  }
  @Test	
  @Parameters({"pwdElement","password"})
  public void CEnterPasswordandSignIN(String pwdElement, String password)
	
  {
		 LoginMyApp.InsertTextById(pwdElement, password);
		 LoginMyApp.ClickOnLinkByClassName("lgn_btn");  
  }
}
