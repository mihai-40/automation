import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.java.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

@Test
public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emag.ro/");

        HomePage homepage = new HomePage(driver);
        assertTrue(homepage.checkWebsite());


    }
}



