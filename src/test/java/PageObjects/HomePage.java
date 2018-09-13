package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageNavigator {

    public HomePage(WebDriver driver){
        super(driver);
    }

    public LoginPage openLogInPage(){
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[6]/a")).click();
        return new LoginPage(driver);
    }

    public SignUpPage openSignUpPage(){
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[1]/a")).click();
        return new SignUpPage(driver);

    }



}
