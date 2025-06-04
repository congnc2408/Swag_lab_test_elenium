package com.swag_labs.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseConfig {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        BaseConfig.driver = driver;
    }

    protected WebElement find(By locator){
        return driver.findElement(locator);
    }

    protected List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    protected void setText(By locator, String text){
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    protected void click(By locator){
        find(locator).click();
    }

    protected boolean isClicked(By locator){
        return find(locator).isSelected();
    }

    public static void delay(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
