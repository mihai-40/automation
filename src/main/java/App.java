import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.java.HomePage;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;


import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;




public class App {


    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.emag.ro/");

        HomePage homepage = new HomePage(driver);
        assertTrue(homepage.checkWebsite());

        assertTrue(homepage.acceptCookies());
        homepage.tearDown();



    }
}



