package com.swag_labs.swag_lab.login;

import org.openqa.selenium.By;

import com.swag_labs.base.BaseConfig;

public class ProductPage extends BaseConfig {
    private By productHeader =  By.xpath("//div//span[@class = 'title']");
    public boolean isProductPageDisplayed() {
        return find(productHeader).isDisplayed();
    }
}
