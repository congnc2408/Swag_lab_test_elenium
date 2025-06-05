package com.swag_labs.utilities;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility extends Utility {
    public static Select findDropDown(By locator) {
        return new Select(driver.findElement(locator));
    }

    public static void selectByVisibleText(By locator, String text){
        findDropDown(locator).selectByVisibleText(text);
    }

    public static void selectByIndex(By locator, int index){
        findDropDown(locator).selectByIndex(index);
    }

    public static void selectByValue(By locator, String value){
        findDropDown(locator).selectByValue(value);
    }

    public static void deselectByValue(By locator, String value){
        findDropDown(locator).deselectByValue(value);
    }

    public static List<String> getAllSelectedOption(By locator){
        List<WebElement> allSelectOptions = findDropDown(locator).getAllSelectedOptions();
        return allSelectOptions.stream()
                .map(WebElement::getText).collect(Collectors.toList());
    }
}
