package com.demoqa.pages.widgets;

import static com.utilities.JavaScriptUtility.*;

import static com.utilities.DropdownUtility.*;

import org.openqa.selenium.By;

public class DatePickerPage extends WidgetsPage{

    private By datePicker = By.id("datePickerMonthYearInput");
    private By monthSelector = By.className("react-datepicker__month-select");
    private By yearSelector = By.cssSelector(".react-datepicker__year-select");

    private By dayValue(String day) {
        return By.xpath("(//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "'])[1]");
    }

    public void clickDatePicker() {
        scrollToElementJS(datePicker);
        clickJs(datePicker);
    }

    public void selectMonth(String month) {
        selectByVisibleText(month, monthSelector);
    }

    public void selectYear(String year) {
        selectByVisibleText(year, yearSelector);
    }

    public void selectDay(String day) {
        clickJs(dayValue(day));
    }

    public String getDateValue() {
        return find(datePicker).getAttribute("value");
    }

}
