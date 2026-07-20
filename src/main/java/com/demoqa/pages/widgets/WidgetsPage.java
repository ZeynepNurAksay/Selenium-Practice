package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import static com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

public class WidgetsPage extends HomePage {

    private By selectMenuMenuItem = By.xpath("//li[@id='item-8']//span[text()='Select Menu']");
    private By selectDatePickerMenuItem = By.xpath("//li[@id='item-2']//span[text()='Date Picker']");
    private By progressBarMenuItem = By.xpath("//li[@id='item-4']//span[text()='Progress Bar']");

    public SelectMenuPage clickSelectMenuMenuItem() {
        scrollToElementJS(selectMenuMenuItem);
        clickJs(selectMenuMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerPage clickDatePickerMenuItem(){
        scrollToElementJS(selectDatePickerMenuItem);
        clickJs(selectDatePickerMenuItem);
        return new DatePickerPage();
    }

    public ProgressBarPage clickProgressBarMenuItem() {
        scrollToElementJS(progressBarMenuItem);
        clickJs(progressBarMenuItem);
        return new ProgressBarPage();
    }

}
