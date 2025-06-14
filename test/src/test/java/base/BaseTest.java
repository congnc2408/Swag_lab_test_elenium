package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.swag_labs.base.BaseConfig;
import com.swag_labs.swag_lab.login.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

import static com.swag_labs.utilities.Utility.setUtilityDriver;

public class BaseTest {
    protected WebDriver driver;
    protected BaseConfig baseConfig;
    protected LoginPage loginPage;
    private String baseUrl = "https://www.saucedemo.com/";


    @BeforeTest
    public void setUp(){
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        loginPage = new LoginPage();
        baseConfig = new BaseConfig();
        
        BaseConfig.setDriver(driver);
        setUtilityDriver();
       
       // driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
        //driver.manage().deleteAllCookies();
    }

    @AfterTest
    public void tearDown(){
        if (driver != null) {
            baseConfig.delay(2);
            driver.quit();
        }
    }
}
