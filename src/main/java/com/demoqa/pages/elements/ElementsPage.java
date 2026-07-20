package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.*;

public class ElementsPage extends HomePage {

    private By webTablesMenuItem = By.xpath("//li[@id='item-3']//span[text()='Web Tables']");
    private By linksMenuItem = By.xpath("//li[@id='item-5']//span[text()='Links']");
    private By dynamicElementsMenuItem = By.xpath("//div[@id='root']//li[@id='item-8']//span[text()='Dynamic Properties']");

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

    public DynamicElementsPage clickDynamicElements() {
        scrollToElementJS(dynamicElementsMenuItem);
        clickJs(dynamicElementsMenuItem);
        return new DynamicElementsPage();
    }

}
