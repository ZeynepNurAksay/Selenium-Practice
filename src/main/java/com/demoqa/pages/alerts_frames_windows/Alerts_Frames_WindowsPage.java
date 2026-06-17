package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import static com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

public class Alerts_Frames_WindowsPage extends HomePage {

    private By modalDialogsMenuItem = By.xpath("//li[@id='item-4']//span[text()='Modal Dialogs']");
    private By alertsMenuItem = By.xpath("//li[@id='item-1']//span[text()='Alerts']");

    public ModalDialogsPage clickModalDialogsMenuItem() {
        scrollToElementJS(modalDialogsMenuItem);
        clickJs(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlertsMenuItem() {
        scrollToElementJS(alertsMenuItem);
        clickJs(alertsMenuItem);
        return new AlertsPage();
    }



}
