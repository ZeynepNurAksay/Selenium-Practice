package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.*;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");

    public WebTablePage clickWebTable() {
        scrollToElementJS(webTablesMenuItem);
        clickJs(webTablesMenuItem);
        return new WebTablePage();
    }

    public LinksPage clickLinks() {
        scrollToElementJS(linksMenuItem);
        clickJs(linksMenuItem);
        return new LinksPage();
    }

}
