/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package principal;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 *
 * @author nitzyb
 */
public class Simulacion {

    public static void main(String[] args) {
        casoderoger();
    }
    static void casoderoger()
    {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("offersBtn")).click();
        driver.findElement(By.cssSelector("body > div.main > div.ng-scope > div.row.position-relative > section > div.filter > form > div > div:nth-child(5) > div > label")).click();
         
        driver.findElement(By.cssSelector("#Combosubcategories")).click();
        driver.findElement(By.xpath("//*[@id=\"Combosubcategories\"]/option[2]")).click();
    }
   
}
