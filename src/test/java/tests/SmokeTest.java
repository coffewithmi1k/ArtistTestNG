package tests;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PageNavigator;
import PageObjects.SignUpPage;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
@Epic("Smoke tests")
//@Feature("Smoke Tests")

public class SmokeTest {

    /*
    1. Check WebsiteisOn
    2. Check Log in
    3. Check Sign Up confirmation pop-up
    4. Check that search by Name from the main page works
    5. Check that search by Event from the main page works
    6. Check that search by Location works from the main page.
    7. Check Search by Categories;
    8. Check search by Event type
    9. Check main logo redirects to the Home Page.

     */

    WebDriver driver;
    int random =(int) (Math.random()*1000+1);

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test(description = "Check WebsiteisOn", priority = 0)
    public void checkHomePageOpened(){
        PageNavigator pn = new PageNavigator(driver);
        pn.openHomePage();
        assertThat(driver.getTitle(),equalTo("Artist Next Door"));

    }
    @Test(description = "Check Log in",priority = 1)
    public void checkUserCanLogin() throws InterruptedException {
        PageNavigator pn = new PageNavigator(driver);
       HomePage onHomePage = pn.openHomePage();
       LoginPage onLoginPage = onHomePage.openLogInPage();
       onLoginPage.fillLogInFields("coffe1@mailinator.com","qwe1156q");
       onLoginPage.clickLogInButton();
       assertThat(onLoginPage.verifyUserLogged().getText(),equalTo("coffe1@mailinator.com"));

    }
    @Test(description = "Check Sign Up confirmation pop-up", priority = 2)
    public void checkUserCanSignUP() throws InterruptedException {
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.openHomePage();
        SignUpPage onSignUpPage = onHomePage.openSignUpPage();
        onSignUpPage.fillRegisterFields("coffe"+random+"@mailinator.com","qwe1156q");
        onSignUpPage.clickSignUpButton();
        assertThat(onSignUpPage.verifySignUpIsSuccessfull().getText(),equalTo("Welcome to Artist"));

    }

    @Test(description = "Check that search by Name from the main page works")
    public void checkMainSearchByName() throws InterruptedException {
        PageNavigator pn = new PageNavigator(driver);
        HomePage onHomePage = pn.openHomePage();


    }



}
