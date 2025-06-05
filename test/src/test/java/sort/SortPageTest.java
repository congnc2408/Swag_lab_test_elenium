package sort;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.swag_labs.base.BaseConfig;
import com.swag_labs.swag_lab.login.ProductPage;

import base.BaseTest;

public class SortPageTest extends BaseTest {
    private By titleSelect = By.xpath("//select[@class = 'product_sort_container']");
    private By sortAZ = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'az']");
    private By sortZA = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'za']");
    private By sortLowHigh = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'lohi']");
    private By sortHighLow = By.xpath("//select[@class = 'product_sort_container']/option[@value = 'hilo']");

    @Test
    public void testSortByAZ() {
        ProductPage productPage = new ProductPage();
        productPage = loginPage.logintoApplication("standard_user", "secret_sauce");
        baseConfig.delay(2);
       productPage.selectDropDown( titleSelect);
        baseConfig.delay(2);
        ///productPage.setDriver(driver);
        productPage.selectSortOption("za", sortZA);
    }
}
