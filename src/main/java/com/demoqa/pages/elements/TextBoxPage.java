package com.demoqa.pages.elements;

import com.utilities.ActionsUtility;
import com.utilities.JavaScriptUtility;
import com.utilities.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class TextBoxPage extends ElementsPage{

    private By fullNameTextBox = By.id("userName");
    private By currentAddressTextBox = By.xpath("//textarea[@id='currentAddress']");
    private By submitButton = By.id("submit");
    private By currentAddressResult = By.xpath("//p[@id='currentAddress']");

    public void setFullName(String name) {
        JavaScriptUtility.scrollToElementJS(fullNameTextBox);
        ActionsUtility.sendKeys(find(fullNameTextBox), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }

    public void setCurrentAddress(String address) {
        find(currentAddressTextBox).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmit() {
        JavaScriptUtility.scrollToElementJS(submitButton);
        JavaScriptUtility.clickJs(submitButton);
    }

    public String getCurrentAddress() {
        WaitUtility.explicityWaitUntilVisible(5, currentAddressResult);
        return find(currentAddressResult).getText();
    }

}
