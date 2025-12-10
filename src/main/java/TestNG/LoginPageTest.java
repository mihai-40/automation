package TestNG;
import POM.java.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ISuite;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import POM.java.LoginPage;

public class LoginPageTest {

    WebDriver driver;

    LoginPage loginPage;

    @BeforeMethod
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");

        driver = new ChromeDriver(options);
        driver.get("https://auth.emag.ro/user/login");

        loginPage = new LoginPage(driver);
    }


}
