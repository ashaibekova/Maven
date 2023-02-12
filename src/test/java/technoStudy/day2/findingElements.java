package technoStudy.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findingElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study");
        Thread.sleep(3000);
        driver.navigate().to("https://facebook.com");
        driver.navigate().back();
        driver.navigate().forward();

        WebElement sloganText = driver.findElement(By.className("_8eso"));

        String expected = "Connect with friends and the world around you on Facebook.";
        String actual = sloganText.getText();

        if(expected.equals(actual)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");
    }
}
