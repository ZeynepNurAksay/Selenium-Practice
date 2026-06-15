package part3_4.com.demoqa.test.part4.alerts;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalHandlingTest extends BaseTest {

    @Test
    public void testSmallModal() {
        var alertsPage = homePage.goToAlerts().clickModalDialogsMenuItem();

        alertsPage.clickSmallButton();
        String actualtext = alertsPage.getPopupText();
        alertsPage.clickCloseButton();

        Assert.assertTrue(actualtext.contains("This is a small modal."));
    }

}
