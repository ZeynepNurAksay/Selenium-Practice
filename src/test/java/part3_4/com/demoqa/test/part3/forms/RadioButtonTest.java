package part3_4.com.demoqa.test.part3.forms;

import com.demoqa.pages.forms.FormsPage;
import com.demoqa.pages.forms.PracticeFormPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class RadioButtonTest extends BaseTest {
    @Test
    public void testRadioButton() {
        PracticeFormPage formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        Assert.assertTrue(formsPage.isFemaleSelected());
    }
}
