package test.java;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    By logo = By.xpath("//*[@id='masthead']/div/div/div[1]/a/img");
    // Define the locator
    By acceptCookiesLocator = By.xpath("//button[text()='Accept toate ']");

    // Use the locator to find the element

   // By AddButton = By.xpath();

    //functie care verifica ca suntem pe emag

    public boolean checkWebsite() {

       boolean result = driver.findElement(logo).isDisplayed();
       if(result) {System.out.print("element was found");}
       return result;

    }

    //public boolean checkAddToBasket(){}

    public boolean acceptCookies(){
        WebElement acceptCookies = driver.findElement(acceptCookiesLocator);
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", acceptCookies);
        return true;


    }

    public By checkAcceptedCookies(){
        WebElement acceptCookies = driver.findElement(acceptCookiesLocator);
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) acceptCookies));
        return (By) acceptCookies;
    }

}


