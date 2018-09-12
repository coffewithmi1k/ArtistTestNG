package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ExampleTest {


    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void getGoogle(){
        driver.get("Https:google.com");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
