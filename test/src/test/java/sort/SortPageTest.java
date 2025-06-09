package sort;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.swag_labs.base.BaseConfig;
import com.swag_labs.swag_lab.login.ProductPage;
import com.swag_labs.swag_lab.login.Purchase;

import base.BaseTest;
import org.testng.Assert;

public class SortPageTest extends BaseTest {
   
    private By sortAZ = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'az']");
    private By sortZA = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'za']");
    private By sortLowHigh = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'lohi']");
    private By sortHighLow = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'hilo']");

    @Test(priority = 1)
    public void testSortByZA() {
        ProductPage productPage = new ProductPage();
        productPage = loginPage.logintoApplication("standard_user", "secret_sauce");
        baseConfig.delay(3);
        //productPage.selectSortOption("za");
    }

    @Test(dependsOnMethods = {"testSortByZA"})
    public void addToCart(){
        Purchase purchase = new Purchase();
        purchase.addToCart();
        baseConfig.delay(2);
        Assert.assertTrue(true , "Thank you for your order!");

        
    }
}
