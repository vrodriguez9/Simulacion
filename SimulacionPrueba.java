

package com.mycompany.simulacionprueba;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author jayfa
 */
public class SimulacionPrueba {

    public static void main(String[] args) {
      

        System.setProperty("webdriver.chrome.driver", "Users/jayfa/Documents/NetBeansProjects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();
        //driver.manage().window().maximize();

        WebElement farmacias = driver.findElement(By.cssSelector("a.nav-link.active"));
        farmacias.click();

        
        driver.findElement(By.cssSelector("#fromblogfischel > button")).click();
        driver.findElement(By.cssSelector("#frominfantil > button")).click();

    }
}
