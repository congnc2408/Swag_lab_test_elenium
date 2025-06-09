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
    private By buttonCart = By.xpath("//div[@id = 'shopping_cart_container']/a[@class = 'shopping_cart_link']");
    private By buttonCheckout = By.xpath("//div[@class = 'cart_footer']/button[text() = 'Checkout']");
    private By inputFirstName = By.xpath("//input[@id = 'first-name']");
    private By inputLastName = By.xpath("//input[@id = 'last-name']");
    private By inputPostalCode = By.xpath("//input[@id = 'postal-code']");
    private By buttonContinue = By.xpath("//input[@id = 'continue']");
    private By buttonFinish = By.xpath("//button[@id = 'finish']");

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
        delay(2);
        click(buttonCart);
        delay(2);
        click(buttonCheckout);
        delay(2);
        setText(inputFirstName, "John");
        setText(inputLastName, "Doe");
        setText(inputPostalCode, "12345");
        click(buttonContinue);
        delay(2);
        click(buttonFinish);
        delay(2);

    }

}
