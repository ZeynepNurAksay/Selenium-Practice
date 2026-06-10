package com.demoqa.pages.elements;

import static com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

public class WebTablePage extends ElementsPage{

    private By ageField = By.id("age");
    private By submitButton = By.id("submit");

    public String getAge(String email) {
        By ageCell = By.xpath("//td[text()='" + email + "']//preceding::td[1]");
        String age = find(ageCell).getText();
        return age;
    }

    public void clickEditButton(String email) {
        By editButton = By.xpath("(//td[text()='" + email + "']//following::span[@title='Edit'])[1]");
        scrollToElementJS(editButton);
        clickJs(editButton);
    }

    public void editAge(String age) {
        set(ageField, age);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        clickJs(submitButton);
    }
}
