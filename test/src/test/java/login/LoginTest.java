package login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swag_labs.swag_lab.login.ProductPage;

import base.BaseTest;


public class LoginTest extends BaseTest {
    String username = "standard_user";
    String password = "secret_sauce";

    @Test
    public void testLogin(){
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        ProductPage productPage = new ProductPage();
        Assert.assertTrue(productPage.isProductPageDisplayed(), "Product page is not displayed after login");
       

    }
}
