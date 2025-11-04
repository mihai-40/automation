package test.java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {

    WebDriver driver;

    //Constructor that will be automatically called as soon as the object of the class is created

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By Logo = By.xpath("//*[@id='masthead']/div/div/div[1]/a/img");

    //functie care verifica ca suntem pe emag

    public boolean checkWebsite() {

       boolean result = driver.findElement(Logo).isDisplayed();
       if(result) {System.out.print("element was found");}
       return result;

    }
}


