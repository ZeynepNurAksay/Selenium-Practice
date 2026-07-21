package com.demoqa.pages.widgets;

import com.utilities.ActionsUtility;
import com.utilities.GetUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class SliderPage extends WidgetsPage{

    private By slider = By.xpath("//div[@id='sliderContainer']//input[@type='range']");
    private By sliderValue = By.id("sliderValue");

    public void moveSlider(int x, int y) {
        ActionsUtility.dragAndDropBy(x,y,find(slider));
    }

    public String getSliderValue() {
        return GetUtility.getAttribute(sliderValue, "value");
    }

}
