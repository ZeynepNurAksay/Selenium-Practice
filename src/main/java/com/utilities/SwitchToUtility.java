package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SwitchToUtility extends Utility{

    private static WebDriver.TargetLocator switchTo() {
        return driver.switchTo();
    }

    public static String getAlertText() {
        return switchTo().alert().getText();
    }

    public static void acceptAlert() {
        switchTo().alert().accept();
    }

    public static void rejectAlert() {
        switchTo().alert().dismiss();
    }

    public static void enterIntoAlert(String name) {
        switchTo().alert().sendKeys(name);
    }

    public static void switchToFrame(String iFrameId) {
        driver.switchTo().frame(iFrameId);
    }

    public static void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }

    public static void switchToFrame(int id) {
        driver.switchTo().frame(id);
    }

    public static void switchToFrameElement(WebElement element) {
        driver.switchTo().frame(element);
    }

}
