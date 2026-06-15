package com.demoqa.pages.alerts;

import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class ModalDialogsPage extends AlertsPage{

    private By smallButton = By.id("showSmallModal");
    private By smallModel = By.xpath("//div[contains(text(), 'small modal')]");
    private By closeButton = By.id("closeSmallModal");

    public void clickSmallButton() {
        JavaScriptUtility.scrollToElementJS(smallButton);
        JavaScriptUtility.clickJs(smallButton);
    }

    public String getPopupText() {
        return find(smallModel).getText();
    }

    public void clickCloseButton() {
        JavaScriptUtility.scrollToElementJS(closeButton);
        JavaScriptUtility.clickJs(closeButton);
    }

}
