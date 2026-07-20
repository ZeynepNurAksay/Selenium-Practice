package com.demoqa.pages.elements;

import com.utilities.GetUtility;
import com.utilities.JavaScriptUtility;
import com.utilities.WaitUtility;
import org.openqa.selenium.By;

public class DynamicElementsPage extends ElementsPage{

    private By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        WaitUtility.explicityWaitUntilVisible(5, visibleAfterButton);
        return GetUtility.getText(visibleAfterButton);
    }

}
