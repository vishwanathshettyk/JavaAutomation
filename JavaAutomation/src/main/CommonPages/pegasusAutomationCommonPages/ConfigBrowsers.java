package pegasusAutomationCommonPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeMethod;

public class ConfigBrowsers {

	public static WebDriver driver;
    String browser="Chrome";
    String url="https://pegasus5.qa.pegasus.pearsoncmg.com";

    /**
     * 
     */
    @BeforeMethod
    public WebDriver LaunchBrowser() {

    	  if(browser.equalsIgnoreCase("mozilla"))
              driver= new FirefoxDriver();
          else if(browser.equalsIgnoreCase("safari"))
              driver= new SafariDriver();
          else if(browser.equalsIgnoreCase("chrome"))
        	  System.setProperty("webdriver.chrome.driver", "D:\\Java Softwares\\selenium-java-2.45.0\\chromedriver.exe");
              driver= new ChromeDriver();   
              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
              driver.navigate().to(url);
           //if(url.equalsIgnoreCase("VCD"))
        		  // driver.navigate().to("http://pegasqausvcd.ecollege-labs.com/");
           //else if (url.equalsIgnoreCase(CGIE))
        	     //driver.navigate().to("https://pegasus5.qa.pegasus.pearsoncmg.com");
           //else if (url.equalsIgnoreCase(PPE))
      	    // driver.navigate().to("http://mylabs.px.ppe.pearsoncmg.com");
              //driver.manage().deleteAllCookies();
           return driver;
  }
	public static WebDriver getDriver() {
		return driver;
	}
}

