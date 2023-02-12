package technoStudy.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;


public class firstTest {
    public static void main(String[] args) {

        //to set chrome driver
        WebDriverManager.chromedriver().setup();
        //creating object to open browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        System.out.println("Title is = "+ driver.getTitle());
        System.out.println("URL is "+driver.getCurrentUrl());

        driver.navigate().to("https://www.techno.study");
        String expectedTitle="Join the best coding bootcamps online and get IT training in the US";
        String actrualTitle = driver.getTitle();

        if (expectedTitle.equals(actrualTitle)){
            System.out.println("Verification PASS");
            System.out.println("passed Title is= "+actrualTitle);

        }else
            System.out.println("FAILED");


    }


}