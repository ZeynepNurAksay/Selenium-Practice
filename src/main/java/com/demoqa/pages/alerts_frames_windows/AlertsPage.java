package com.demoqa.pages.alerts_frames_windows;

import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{

    private By alertButton = By.id("alertButton");
    private By confirmAlertButton = By.id("confirmButton");
    private By confirmResult = By.id("confirmResult");

    public void clickAlertButton() {
        JavaScriptUtility.scrollToElementJS(alertButton);
        JavaScriptUtility.clickJs(alertButton);
    }

    public void clickConfirmAlertButton(){
        JavaScriptUtility.scrollToElementJS(confirmAlertButton);
        JavaScriptUtility.clickJs(confirmAlertButton);
    }

    public String getResultText() {
        return find(confirmResult).getText();
    }

}
