
import java.util.concurrent.TimeUnit;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CasoDeValeria {

    private WebDriver driver;

    @Before
    public void setUp() {
        
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.fischelenlinea.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void pruebas() {
        
        WebElement farmacias = driver.findElement(By.cssSelector("a.nav-link:nth-child(5)"));
        farmacias.click();

        driver.manage().timeouts().implicitlyWait(165, TimeUnit.SECONDS);
        System.out.println(driver.getTitle());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
