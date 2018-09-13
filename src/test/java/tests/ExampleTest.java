package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ExampleTest {


    WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    public void getGoogle(){
        driver.get("Https:google.com");
        assertThat(driver.getTitle(), equalTo("Artist"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
