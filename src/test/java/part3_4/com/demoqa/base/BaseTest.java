package part3_4.com.demoqa.base;

import com.demoqa.pages.HomePage;
import com.BasePage;
import com.utilities.JavaScriptUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    private WebDriver driver;
    protected BasePage basePage;
    protected HomePage homePage;
    private String url = "https://demoqa.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        JavaScriptUtility.setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void quit() {
        driver.quit();
    }

}
