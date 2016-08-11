package pegasusAutomationscripts;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pegasusAutomationCommonPages.BasePage;

public class CreateCourse {
	BasePage CreateInstructorCourse = new BasePage();
  @Test
  @Parameters("ccElement")
  public void ACreateWLCourse(String ccElement) {
		CreateInstructorCourse.ClickOnLinkById(ccElement);
  }
  @Test
  @Parameters("XpathValue")
  public void BSelectCreateCourseWindow(String XpathValue) 
  {
		CreateInstructorCourse.SwitchToIFrameByXPath(XpathValue);
		CreateInstructorCourse.SwithtoDefaultContent();
		CreateInstructorCourse.WaitforElement();
  }
  @Test
  @Parameters({"tboxElement","ISBNValue"})
  public void CClickOnSearchByRadioButton(String tboxElement , String ISBNValue)
  {
	  
	  CreateInstructorCourse.InsertTextById(tboxElement, ISBNValue);
  }
}
