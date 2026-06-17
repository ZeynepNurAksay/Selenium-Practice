package com.demoqa.pages.alerts_frames_windows;

import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class AlertsPage extends Alerts_Frames_WindowsPage{

    private By alertButton = By.id("alertButton");

    public void clickAlertButton() {
        JavaScriptUtility.scrollToElementJS(alertButton);
        JavaScriptUtility.clickJs(alertButton);
    }

}
