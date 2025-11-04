import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import test.java.HomePage;




public class App {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.emag.ro/");

        HomePage homepage = new HomePage(driver);

        assert homepage.checkWebsite(): "Nu esti pe pagina corecta";


    }
}



