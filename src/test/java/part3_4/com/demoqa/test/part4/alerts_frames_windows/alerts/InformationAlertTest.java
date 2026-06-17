package part3_4.com.demoqa.test.part4.alerts_frames_windows.alerts;

import com.utilities.SwitchToUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class InformationAlertTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedText = "You clicked a button";
        var alertsPage = homePage.goToAlerts().clickAlertsMenuItem();
        alertsPage.clickAlertButton();
        Assert.assertEquals(SwitchToUtility.getAlertText(), expectedText);
        SwitchToUtility.acceptAlert();
    }

}
