package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WaitUtils;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://www.westernunion.com/lt/en/home.html");
        WaitUtils.waitUntilElementToBeVisible(By.id("onetrust-accept-btn-handler"), 2);
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
