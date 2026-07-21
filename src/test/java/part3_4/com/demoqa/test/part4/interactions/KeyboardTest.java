package part3_4.com.demoqa.test.part4.interactions;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class KeyboardTest extends BaseTest {

    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBoxMenuItem();
        textBoxPage.setFullName("Zeynep Nur Aksay");
        textBoxPage.setEmail("aksayzeynepnur@gmail.com");
        textBoxPage.setCurrentAddress("22 Owen Close");
        textBoxPage.setCurrentAddress("LE3 3TZ");
        textBoxPage.clickSubmit();
        Assert.assertTrue(textBoxPage.getCurrentAddress().contains("LE3"));
    }

}
