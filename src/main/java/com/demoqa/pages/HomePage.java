package com.demoqa.pages;

import com.demoqa.pages.alerts.AlertsPage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import com.BasePage;
import com.demoqa.pages.widgets.WidgetsPage;
import static com.utilities.JavaScriptUtility.*;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By formsCard = By.xpath("//div[@id='root']//h5[text()='Forms']");
    private By elementsCard = By.xpath("//div[@id='root']//h5[text()='Elements']");
    private By widgetsCard = By.xpath(" //div[@id='root']//h5[text()='Widgets']");
    private By alertsCard = By.xpath("//div[@id='root']//h5[contains(text(),'Alerts')]");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        clickJs(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements() {
        scrollToElementJS(elementsCard);
        clickJs(elementsCard);
        return new ElementsPage();
    }

    public WidgetsPage goToWidgets() {
        scrollToElementJS(widgetsCard);
        clickJs(widgetsCard);
        return new WidgetsPage();
    }

    public AlertsPage goToAlerts() {
        scrollToElementJS(alertsCard);
        clickJs(alertsCard);
        return new AlertsPage();
    }

}
