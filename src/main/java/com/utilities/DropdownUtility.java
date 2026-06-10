package com.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownUtility extends Utility{

    private static Select findDropdown(By locator) {
        Select select = new Select(driver.findElement(locator));
        return select;
    }

    public static void selectByVisibleText(String text, By locator) {
        Select select = findDropdown(locator);
        select.selectByVisibleText(text);
    }

    public static void selectByIndex(int index, By locator) {
        Select select = findDropdown(locator);
        select.selectByIndex(index);
    }

    public static void selectByValue(String value, By locator) {
        Select select = findDropdown(locator);
        select.selectByValue(value);
    }

    public static void deselectByValue(String value, By locator) {
        Select select = findDropdown(locator);
        select.deselectByValue(value);
    }

    public static List<String> getAllSelectedOptions(By locator) {
        List<WebElement> allSelectedOptions = findDropdown(locator).getAllSelectedOptions();
        return allSelectedOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

}
