package part3_4.com.demoqa.test.part3.widgets;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class DatePickerTest extends BaseTest {

    @Test
    public void testDatePicker() {
        var datePickerPage = homePage.goToWidgets().clickDatePickerMenuItem();

        datePickerPage.clickDatePicker();
        datePickerPage.selectMonth("March");
        datePickerPage.selectYear("2002");
        datePickerPage.selectDay("2");

        String actualDate = datePickerPage.getDateValue();

        Assert.assertEquals(actualDate, "03/02/2002");
    }

}
