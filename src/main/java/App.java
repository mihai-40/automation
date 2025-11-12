import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import test.java.HomePage;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import java.sql.Driver;
import java.time.Duration;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;




public class App {


    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emag.ro/");

        HomePage homepage = new HomePage(driver);
        assertTrue(homepage.checkWebsite());
        assertTrue(homepage.acceptCookies());
        homepage.tearDown();



    }
}



