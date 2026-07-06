package part3_4.com.demoqa.test.part4.alerts_frames_windows.windows;

import com.utilities.GetUtility;
import com.utilities.SwitchToUtility;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WindowsTest extends BaseTest {

    @Test
    public void testNewWindowURL() {
        var windowsPage = homePage.goToAlerts().clickBrowserWindows();
        windowsPage.clickWindowButton();
        SwitchToUtility.switchToNewWindow();
        String actualURL = GetUtility.getURL();
        String expectedURL = "https://demoqa.com/sample";
        Assert.assertEquals(actualURL,expectedURL);
    }

}
