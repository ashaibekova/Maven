package technoStudy.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class moreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/");
        System.out.println("Title is = "+ driver.getTitle());
        String expectedTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASSED");
        }else System.out.println("FAILED actual Title is "+actualTitle);

        Thread.sleep(3000);
        String TeslaURL = "https://www.tesla.com/";
        driver.navigate().to(TeslaURL);
        driver.manage().window().maximize();

    }
}
