package pegasusAutomationCommonPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BasePage extends ConfigBrowsers {
	
	//Insert text to a text box
	public void InsertTextById(String by , String TexttoFill)
	{
	
		WebElement insertext = ConfigBrowsers.getDriver().findElement(By.id(by));
		insertext.sendKeys(TexttoFill);
	}
	
	//Click on button or a Link
	public  void ClickOnLinkById(String by)
	{
		WebElement clicklink = ConfigBrowsers.getDriver().findElement(By.id(by));
		clicklink.click();	
	}
	//Insert text to box : UserName and Password
	public  void InsertTextByText(String by)
	{
		WebElement insertext = ConfigBrowsers.getDriver().findElement(By.linkText(by));
		insertext.sendKeys();	
	}
	
	public void ClickOnLinkByXPath(String xPathElement)
	{
		WebElement ClickLink = ConfigBrowsers.getDriver().findElement(By.xpath(xPathElement));
		ClickLink.click();
	}
	
	//Click on button or a Link
	public  void ClickOnLinkByText(String by)
	{
		WebElement clicklink = ConfigBrowsers.getDriver().findElement(By.linkText(by));
		clicklink.click();	
	}
	
	public  void ClickOnLinkByClassName(String by)
	{
		WebElement clicklink = ConfigBrowsers.getDriver().findElement(By.className(by));
		clicklink.click();	
	}

	public void SwithcToFrame(String frameName)
	{
		ConfigBrowsers.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ConfigBrowsers.getDriver().switchTo().frame(frameName);
	}
	
	public void SwitchToFrameByID(String ID)
	{
		ConfigBrowsers.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ConfigBrowsers.getDriver().switchTo().frame(ID);
	}
	public void SwitchToIFrameByXPath(String XpathValue)
	{
		ConfigBrowsers.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ConfigBrowsers.getDriver().switchTo().frame(XpathValue);
	}
	
	public void AssertEqualMyPage(String ExpectedTitle) throws Throwable
	
	{

		Thread.sleep(2000);
		String pageTitle = ConfigBrowsers.getDriver().getTitle();
		assertEquals("Current page title", ExpectedTitle, pageTitle);

	}
	public void SwithtoDefaultContent()
	{
		ConfigBrowsers.getDriver().switchTo().defaultContent();
	}
	
	public void GetParentWindow()
	
	{
		String winHandleBefore = ConfigBrowsers.getDriver().getWindowHandle();
		ConfigBrowsers.getDriver().switchTo().window(winHandleBefore);

	}
	
	public  void SelectNewWindow() {
		String parent = ConfigBrowsers.getDriver().getWindowHandle();
		Set<String> availableWindows = ConfigBrowsers.getDriver().getWindowHandles();//this set size is
					   // returned as 1 and not 2
						
						String newWindow = null;
					    for (String window : availableWindows) {
					if (!parent.equals(window)) {
					            newWindow = window;
					        }
					    }
						 // switch to new window
					    ConfigBrowsers.getDriver().switchTo().window(newWindow);
		}
	
	
	public void WaitforElement()
	{
		ConfigBrowsers.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public boolean isElementVisible(By expectedValue)
	{
		ConfigBrowsers.getDriver().findElement(expectedValue);
		return true;
	}
	public void SwitchByIndex(int arg)
	{
		ConfigBrowsers.getDriver().switchTo().frame(arg);
	}
}

