import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class myfirsttest {
    public static void main(String[] args) {
        WebDriverManager.safaridriver().setup();

        WebDriver driver = new SafariDriver();

      // driver.get("https://www.youtube.com");
        System.out.println("title of safari "+ driver.getTitle());
        System.out.println("url of safari " + driver.getCurrentUrl());
        driver.navigate().to("https://www.techno.study");

        String expectedTitle ="Join the best coding bootcamps online and get IT training in the US";
        String actualTitle = driver.getTitle();

        if (expectedTitle.contains(actualTitle)){
            System.out.println("pass "+actualTitle);

        }
        else System.out.println("fail");
    }
}
