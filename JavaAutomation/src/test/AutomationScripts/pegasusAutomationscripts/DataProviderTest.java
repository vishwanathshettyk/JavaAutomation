package pegasusAutomationscripts;

import org.testng.annotations.Test;

import pegasusAutomationCommonPages.BasePage;

import org.testng.annotations.DataProvider;

public class DataProviderTest extends BasePage {
	BasePage dpt = new BasePage();
  @Test(dataProvider = "dp")
  public void f(String n, String s) {
 dpt.InsertTextById(n, s);
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "loginname", "demoinstructor" },
      new Object[] { "password", "Password1" },
    };
  }
}
