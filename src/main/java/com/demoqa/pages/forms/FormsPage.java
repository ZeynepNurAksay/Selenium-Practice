package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class FormsPage extends HomePage {

    private By practiceFormMenuItem = By.xpath("//li[@id='item-0']//span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        JavaScriptUtility.scrollToElementJS(practiceFormMenuItem);
        JavaScriptUtility.clickJs(practiceFormMenuItem);
        return new PracticeFormPage();
    }

}
