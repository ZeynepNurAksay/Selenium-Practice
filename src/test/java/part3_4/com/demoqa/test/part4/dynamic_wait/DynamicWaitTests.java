package part3_4.com.demoqa.test.part4.dynamic_wait;

import com.utilities.WaitUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DynamicWaitTests extends BaseTest {

    public void testDynamicExplicitWaitUntilVisible() {
        var dynamicPropertiesPage = homePage.goToElements().clickDynamicElements();
        String actualText = dynamicPropertiesPage.getVisibleAfterButtonText();
        Assert.assertEquals(actualText, "Visible After 5 Seconds");
    }

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBarMenuItem();
        progressBarPage.clickStartStopButton();
        String actualValue = progressBarPage.getProgressValue();
        Assert.assertEquals(actualValue, "100%");
    }

}
