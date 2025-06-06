package com.swag_labs.swag_lab.login;

import java.util.List;

import org.openqa.selenium.By;

import com.swag_labs.base.BaseConfig;

public class Purchase extends BaseConfig {
    private By addBackPackToCart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-backpack']");
    private By addBikeLightToCart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-bike-light']");
    private By addTShirtToCart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-bolt-t-shirt']");
    private By addJacketToCart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-fleece-jacket']");
    private By addOnsieToCart = By.xpath("//button[@id = 'add-to-cart-sauce-labs-onesie']");
    private By addTShirtRedToCart = By.xpath("//button[@id = 'add-to-cart-test.allthethings()-t-shirt-(red)']");

    public void addToCart(){
        List<By> addToCartButtons = List.of(
            addBackPackToCart,
            addBikeLightToCart,
            addTShirtToCart,
            addJacketToCart,
            addOnsieToCart,
            addTShirtRedToCart
        );
        addToCartButtons.forEach( by ->{
            click(by);
        });
    }

}
