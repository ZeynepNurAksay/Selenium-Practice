package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class SliderTest extends BaseTest {

    @Test
    public void testSliderResult() {
        var sliderPage = homePage.goToWidgets().clickSliderMenuItem();
        sliderPage.moveSlider(180, 0);
        String actualValue = sliderPage.getSliderValue();
        Assert.assertEquals(actualValue, "25");
    }

}
