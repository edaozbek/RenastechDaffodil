package students.eda;

//##Task 1
//
//Go to https://www.etsy.com/
//Maximize window
//
//##Task 2
//Go to https://www.amazon.com/
//get title and print out

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab01 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com/");
        System.out.println("The Title is : "+driver.getTitle());


    }
}