package com.demoqa.pages.widgets;

import com.utilities.GetUtility;
import com.utilities.JavaScriptUtility;
import com.utilities.WaitUtility;
import org.openqa.selenium.By;

public class ProgressBarPage extends WidgetsPage{

    private By startStopButton = By.id("startStopButton");
    private By progressBar = By.xpath("//div[@id='progressBar']//div[@aria-valuenow='100']");

    public void clickStartStopButton() {
        JavaScriptUtility.scrollToElementJS(startStopButton);
        JavaScriptUtility.clickJs(startStopButton);
    }

    public String getProgressValue() {
        WaitUtility.fluentWaitUntilVisible(30, progressBar);
        return GetUtility.getText(progressBar);
    }



}
