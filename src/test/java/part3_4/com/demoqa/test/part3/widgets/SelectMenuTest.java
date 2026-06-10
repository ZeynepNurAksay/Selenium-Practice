package part3_4.com.demoqa.test.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectMenuTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenuMenuItem();
        selectMenuPage.selectMulti("Volvo");
        selectMenuPage.selectMulti(1);
        selectMenuPage.selectMulti("Audi");
        selectMenuPage.selectMulti(2);
        selectMenuPage.deselectMulti("saab");

        List<String> actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"));
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }

}
