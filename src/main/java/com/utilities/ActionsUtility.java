package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsUtility extends Utility{

    private static Actions act() {
        return new Actions(driver);
    }

    public static void dragAndDropBy(int x, int y, WebElement source) {
        act().dragAndDropBy(source, x, y).perform();
    }

    public static void sendKeys(WebElement source, CharSequence keys) {
        act().sendKeys(source, keys).perform();
    }

}
