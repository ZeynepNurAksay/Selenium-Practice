package com.demoqa.pages.alerts;

import com.demoqa.pages.HomePage;
import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class AlertsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");

    public ModalDialogsPage clickModalDialogsMenuItem() {
        JavaScriptUtility.scrollToElementJS(modalDialogsMenuItem);
        JavaScriptUtility.clickJs(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }



}
