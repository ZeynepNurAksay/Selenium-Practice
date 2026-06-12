package part3_4.com.demoqa.test.part4.screenshot;

import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class CaptureFailedScreenshotTest extends BaseTest {

    @Test
    public void testScreenshotFunctionality() {
        var formPage = homePage.goToForms().clickPracticeForm();
        formPage.clickSubmitButton();
    }

}
