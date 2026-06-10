package com.demoqa.pages;

import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import com.utilities.JavaScriptUtility;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private By widgetsCard = By.xpath(" //div[@id='root']//h5[text()='Widgets']");

    public FormsPage goToForms() {
        JavaScriptUtility.scrollToElementJS(formsCard);
        JavaScriptUtility.clickJs(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        JavaScriptUtility.scrollToElementJS(elementsCard);
        JavaScriptUtility.clickJs(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        JavaScriptUtility.scrollToElementJS(widgetsCard);
        JavaScriptUtility.clickJs(widgetsCard);
        return new WidgetsPage();
    }

}
