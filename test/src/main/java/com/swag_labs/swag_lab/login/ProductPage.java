package com.swag_labs.swag_lab.login;

import org.openqa.selenium.By;

import com.swag_labs.base.BaseConfig;
import static com.swag_labs.utilities.DropdownUtility.*;

public class ProductPage extends BaseConfig {
    private By productHeader =  By.xpath("//div//span[@class = 'title']");
 



    public boolean isProductPageDisplayed() {
        return find(productHeader).isDisplayed();
    }

    public void selectSortOption(String value,By locator) {
        selectByValue(locator, value);
        click(locator);
    }

    public void selectDropDown( By locator) {
        findDropDown(locator);
        click(locator);
    }
}
