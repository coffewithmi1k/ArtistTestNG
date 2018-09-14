package PageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageNavigator {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Step("Open log in pop-up")
    public LoginPage openLogInPage() {
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[6]/a")).click();
        return new LoginPage(driver);
    }

    @Step("Open sign Up pop-up")
    public SignUpPage openSignUpPage() {
        driver.findElement(By.xpath("//*[@id=\"navbarTopContent\"]/ul/li[1]/a")).click();
        return new SignUpPage(driver);

    }

    @Step("Insert data in Search By Name field")
    public void fillSearchByNameField(String searchName) {
        driver.findElement(By.xpath("")).sendKeys(searchName);
    }

    @Step("Click search button")
    public SearchResultPage clickSearch(){
        return new SearchResultPage(driver);
    }


}
