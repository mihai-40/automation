package TestNG;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM.java.HomePage;

public class HomePageTest {

    WebDriver driver;
    HomePage homepage;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get("https://www.emag.ro/");

        homepage = new HomePage(driver);
    }

    @Test
    public void testHomePage() {
        Assert.assertTrue(homepage.checkWebsite());
    }

    @Test
    public void testAcceptedCookies() {
        Assert.assertTrue(homepage.acceptCookies());
    }

    @AfterMethod
    public void teardown() {
        homepage.tearDown(); // or driver.quit();
    }
}