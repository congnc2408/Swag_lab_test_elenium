package com.swag_labs.swag_lab.login;

import org.openqa.selenium.By;

import com.swag_labs.base.BaseConfig;
import static com.swag_labs.utilities.DropdownUtility.*;

public class ProductPage extends BaseConfig {
    private By productHeader =  By.xpath("//div//span[@class = 'title']");
    private By titleSelect = By.xpath("//select[@class = 'product_sort_container']");



    public boolean isProductPageDisplayed() {
        return find(productHeader).isDisplayed();
    }

    public void selectSortOption(String value) {
        selectByValue(titleSelect, value);
        click(titleSelect);
    }

    public void selectDropDown( By locator) {
        findDropDown(locator);
        click(locator);
    }
}
