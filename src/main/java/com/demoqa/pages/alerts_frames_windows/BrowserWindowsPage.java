package com.demoqa.pages.alerts_frames_windows;

import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage{

    private By windowButton = By.id("windowButton");

    public void clickWindowButton() {
        JavaScriptUtility.scrollToElementJS(windowButton);
        JavaScriptUtility.clickJs(windowButton);
    }

}
