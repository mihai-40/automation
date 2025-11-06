package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    By logo = By.xpath("//*[@id='masthead']/div/div/div[1]/a/img");
    By acceptCookies = By.xpath("//*[text()='Accept toate']");
   // By AddButton = By.xpath();

    //functie care verifica ca suntem pe emag

    public boolean checkWebsite() {

       boolean result = driver.findElement(logo).isDisplayed();
       if(result) {System.out.print("element was found");}
       return result;

    }

    //public boolean checkAddToBasket(){}

    public boolean acceptCookies(){

       driver.findElement(acceptCookies).click();
       return true;


    }

    public By checkAcceptedCookies(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(acceptCookies));
        return acceptCookies;
    }

}


