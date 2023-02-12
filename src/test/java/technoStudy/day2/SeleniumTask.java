package technoStudy.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://demo.seleniumeasy.com");
        driver.navigate().to("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement text = driver.findElement(By.id("user-message"));
        text.sendKeys("How are you");

        WebElement insert = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        insert.click();

        WebElement result= driver.findElement(By.id("display"));
        System.out.println(result.getText());

        String exp="How are you";
        String act= result.getText();

        if(exp.equals(act)){
            System.out.println("PASSED");
        }else System.out.println("FAILED");


        WebElement insertNum =driver.findElement(By.id("sum1"));
        insertNum.sendKeys("77");

        WebElement insertNum2= driver.findElement(By.id("sum2"));
        insertNum2.sendKeys("78");

        WebElement sum = driver.findElement(By.cssSelector("button[class='btn btn-default']"));

        sum.click();




        //https://demo.seleniumeasy.com/basic-first-form-demo.html
    }
}
