package com.swag_labs.utilities;

import org.openqa.selenium.WebDriver;

import com.swag_labs.base.BaseConfig;

public class Utility {
    public static WebDriver driver;

    public static void setUtilityDriver() {
        driver = BaseConfig.driver;
    }

}
