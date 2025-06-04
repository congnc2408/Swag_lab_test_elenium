package com.swag_labs.swag_lab.login;

import org.openqa.selenium.By;

import com.swag_labs.base.BaseConfig;

public class LoginPage extends BaseConfig{
    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("login_button_container h3");

    public void setUsername(String username){
        setText(usernameField, username);
    }
    public void setPassword(String password){
        setText(passwordField, password);
    }

    public ProductPage clickLoginButton(){
        click(loginButton);
        return new ProductPage();
    }

    public ProductPage logintoApplication(String username, String password){
        setUsername(username);
        setPassword(password);
        return clickLoginButton();
    }

    public String getErrorMessage(){
        return find(errorMessage).getText();
    }
        
    
}
