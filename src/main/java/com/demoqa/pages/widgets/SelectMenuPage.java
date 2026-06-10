package com.demoqa.pages.widgets;

import static com.utilities.JavaScriptUtility.*;

import static com.utilities.DropdownUtility.*;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectMenuPage extends WidgetsPage{

    private By multiSelectDropdown = By.id("cars");

    public void selectMulti(String text) {
        scrollToElementJS(multiSelectDropdown);
        selectByVisibleText(text, multiSelectDropdown);
    }

    public void selectMulti(int index) {
        scrollToElementJS(multiSelectDropdown);
        selectByIndex(index, multiSelectDropdown);
    }

    public void deselectMulti(String value) {
        scrollToElementJS(multiSelectDropdown);
        deselectByValue(value, multiSelectDropdown);
    }

    public List<String> getAllSelectedStandardMultiOptions() {
        return getAllSelectedOptions(multiSelectDropdown);
    }

}
