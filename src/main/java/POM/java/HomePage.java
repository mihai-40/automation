package POM.java;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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


    // Define the locators
    By logo = By.xpath("//*[@id='masthead']/div/div/div[1]/a/img");
    By acceptCookiesLocator = By.xpath("//button[text()='Accept toate ']");

    By searchBar = By.xpath("//*[@id='searchboxTrigger']");
    By searchButton = By.xpath("//i[@class='em em-search']");
    By addProductButton = By.xpath("//button[@data-offer-id='197189470']");

    //verify the correct website

    public void checkWebsite() {

       WebElement result = driver.findElement(logo);

        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        try {
            // 1. ACT: Wait for the element to appear and be visible
            wait.until(ExpectedConditions.visibilityOf(result));


        } catch (Exception e) {
            // 3. HANDLE FAILURE: If the utility method throws a TimeoutException,
            // we catch it and use TestNG's Assert.fail() to explicitly mark the test as failed.
            Assert.fail("Logo verification failed: Element was not found or visible within the timeout.", e);
        }

    }

    //public boolean checkAddToBasket(){}

    public void acceptCookies(){
        WebElement acceptCookies = driver.findElement(acceptCookiesLocator);
        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.elementToBeClickable(acceptCookies));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", acceptCookies);

    }

    public void searchFunction(){
        WebElement searchBox = driver.findElement(searchBar);
        WebElement button = driver.findElement(searchButton);
        searchBox.sendKeys("Iphone 16");
        button.click();

        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(addProductButton));


    }


    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}


