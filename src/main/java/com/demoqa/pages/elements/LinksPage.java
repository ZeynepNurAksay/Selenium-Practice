package com.demoqa.pages.elements;

import static com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

public class LinksPage extends ElementsPage{

    private By badRequestLink = By.id("bad-request");

    public void clickBadRequestLink() {
        scrollToElementJS(badRequestLink);
        clickJs(badRequestLink);
    }

    public String getLinkResponseText() {
        By linkResponse = By.id("linkResponse");
        scrollToElementJS(linkResponse);
        return find(linkResponse).getText();
    }

}
