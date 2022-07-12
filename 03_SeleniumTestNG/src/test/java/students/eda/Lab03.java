package students.eda;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Lab03 {
    public static void main(String [] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("apple");
        WebElement searchButton=driver.findElement(By.name("btnK"));
        searchButton.click();
        String expectedTitle="apple";
        String actualTitle=driver.getTitle();
        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Title verification has passed");}
        else {  System.out.println("Title verification has failed");}

        driver.navigate().back();


        driver.findElement(By.name("q")).sendKeys("cherry");
        Thread.sleep(3000);
        searchButton.click();


        String expectedTitle1 ="cherry";
        String actualTitle1 =driver.getTitle();

        if(actualTitle1.startsWith(expectedTitle1)){
            System.out.println("Title verification has passed");}
        else {  System.out.println("Title verification has failed");}

        driver.navigate().back();
        searchBox.sendKeys("apple");
        driver.findElement(By.name("btnI")).click();
        String expectedTitle2="Apple";
        String actualTitle2=driver.getTitle();
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println("Title verification has passed");}
        else {  System.out.println("Title verification has failed");}

        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

        WebElement login=driver.findElement(By.id("txtUsername"));
        login.sendKeys("Admin");

        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("admin123");

        driver.findElement(By.name("Submit")).click();



    }
}
