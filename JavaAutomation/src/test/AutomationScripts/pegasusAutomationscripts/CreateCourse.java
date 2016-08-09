package pegasusAutomationscripts;

import org.testng.annotations.Test;
import pegasusAutomationCommonPages.BasePage;
import pegasusAutomationCommonPages.ConfigBrowsers;

public class CreateCourse {
	ConfigBrowsers InitiateDriver = new ConfigBrowsers();
	BasePage CreateInstructorCourse = new BasePage();
  @Test
  public void CreateWLCourse() {
		CreateInstructorCourse.ClickOnLinkById("_ctl5:_ctl2:_ctl0:_ctl0:_ctl0:btnSearchCatalog");
		CreateInstructorCourse.SwithcToFrame("Enroll in a Course");
		CreateInstructorCourse.SelectNewWindow();
		CreateInstructorCourse.WaitforElement();
  }
}
