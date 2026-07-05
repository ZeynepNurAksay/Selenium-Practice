package part3_4.com.demoqa.test.part4.alerts_frames_windows.alerts;

import com.utilities.SwitchToUtility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ConfirmationAlertTest extends BaseTest {

    @Test
    public void testConfirmationAlert(){
        var alertsPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertsPage.clickConfirmAlertButton();
        SwitchToUtility.rejectAlert();
        String actualText = alertsPage.getResultText();
        Assert.assertTrue(actualText.contains("Cancel"));
    }

}
