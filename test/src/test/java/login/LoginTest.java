package login;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swag_labs.swag_lab.login.ProductPage;

import base.BaseTest;


public class LoginTest extends BaseTest {
    String username = "standard_user";
    String password = "123442";

    @Test(priority = 1)
    public void testLogin(){
        ProductPage productPage = new ProductPage();
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
        Assert.assertTrue(productPage.loginFail(), "Product page is not displayed after login");
    }
}
