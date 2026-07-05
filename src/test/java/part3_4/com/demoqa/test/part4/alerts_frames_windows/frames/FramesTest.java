package part3_4.com.demoqa.test.part4.alerts_frames_windows.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class FramesTest extends BaseTest {

    public void testFramesBigBox() {
        var framesPage = homePage.goToAlerts().clickFramesMenuItem();
        String actualText = framesPage.getTextInBigFrame();
        String expectedText = "This is a sample page";
        Assert.assertEquals(actualText, expectedText);
        String title = framesPage.getTitle();
        Assert.assertEquals(title, "Frames");
    }

    public void testFramesSmallBox() {
        var framesPage = homePage.goToAlerts().clickFramesMenuItem();
        String actualText = framesPage.getTextInSmallFrame();
        String expectedText = "This is a sample page";
        Assert.assertEquals(actualText, expectedText);
        String title = framesPage.getTitle();
        Assert.assertEquals(title, "Frames");
    }

}
