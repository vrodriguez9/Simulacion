package principal;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Simulacion {

    public static void main(String[] args) {
        //casoderoger();
        casoDeValeria();
        //casoDeBrettsy();
        //casoDeGregory();
    }

    static void casoderoger() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();

        driver.findElement(By.id("offersBtn")).click();
        driver.findElement(By.cssSelector("body > div.main > div.ng-scope > div.row.position-relative > section > div.filter > form > div > div:nth-child(5) > div > label")).click();

        driver.findElement(By.cssSelector("#Combosubcategories")).click();
        driver.findElement(By.xpath("//*[@id=\"Combosubcategories\"]/option[2]")).click();
    }

    static void casoDeValeria() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();

        WebElement farmacias = driver.findElement(By.cssSelector("a.nav-link:nth-child(5)"));
        farmacias.click();

        driver.findElement(By.id("PronvinceCombo")).click();
        driver.findElement(By.id("3")).click();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        driver.findElement(By.id("CantonCombo")).click();
        driver.findElement(By.cssSelector("#\\34 7")).click();
    }

    static void casoDeBrettsy() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();
        
        
        By elementContact = By.cssSelector(".nav-link:nth-child(8)");
        driver.findElement(elementContact).click();
        
        
        driver.findElement(By.id("fullname")).sendKeys("Ana Madrigal Jimenez");
        
        
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        Select se = new Select(driver.findElement(By.id("subject")));
        se.selectByVisibleText("Consulta general");
        
        driver.findElement(By.id("email")).sendKeys("anamadrigal@gmail.com");
        
        driver.findElement(By.id("phone")).sendKeys("88887777");
        
        driver.findElement(By.id("message")).sendKeys("Consulta de planes");
        
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Simulacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        driver.findElement(By.cssSelector("#fromcontactus > button")).click();

    }

    
    
    
    static void casoDeGregory() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/index");
        driver.manage().window().maximize();

        driver.findElement(By.className("btn account")).click();
        driver.findElement(By.id("email")).sendKeys("g.gren54@gmail.com");
        driver.findElement(By.id("password")).sendKeys("SQH#yC3Q");
        driver.findElement(By.id("btnsigin")).click();

    }

}
