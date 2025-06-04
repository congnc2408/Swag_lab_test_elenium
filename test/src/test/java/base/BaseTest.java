package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.swag_labs.base.BaseConfig;
import com.swag_labs.swag_lab.login.LoginPage;

public class BaseTest {
    protected WebDriver driver;
    protected BaseConfig baseConfig;
    protected LoginPage loginPage;
    private String baseUrl = "https://www.saucedemo.com/";

    @BeforeTest
    public void setUp(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        baseConfig = new BaseConfig();
        BaseConfig.setDriver(driver);
        loginPage = new LoginPage();
        // driver.manage().deleteAllCookies();
        // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        
    }

    @AfterTest
    public void tearDown(){
        if (driver != null) {
            baseConfig.delay(2);
            driver.quit();
        }
    }
}
