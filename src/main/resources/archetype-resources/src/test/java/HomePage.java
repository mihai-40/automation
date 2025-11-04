package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeWebDriver;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created

    public HomePage(Webdriver driver){
        this.driver = driver;
    }

    By Logo = By.xpath("//*[@id='masthead']/div/div/div[1]/a/img");

    //functie care verifica ca suntem pe emag
    public boolean checkWebsite(){

        driver.findElement(Logo),isDisplayed();

    }


}