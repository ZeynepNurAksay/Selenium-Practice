package part3_4.com.demoqa.test.part4.alerts_frames_windows.alerts;

import com.utilities.SwitchToUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class PromptAlertTest extends BaseTest {

    @Test
    public void testPromptAlert() {
        var alertPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertPage.clickPromptAlertButton();
        String name = "Zeynep";
        SwitchToUtility.enterIntoAlert(name);
        SwitchToUtility.acceptAlert();
        String actualText = alertPage.getPromptResultText();
        Assert.assertTrue(actualText.contains(name));
    }

}
