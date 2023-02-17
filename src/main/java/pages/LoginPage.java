package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    protected WebDriver driver;

    protected By txtUserName = By.id("userEmail");
    protected By txtPassword = By.id("userPassword");
    protected By btnLogin = By.id("login");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    //Click Save Button
    public void clickLogin() {

        driver.findElement(txtUserName).sendKeys("wcp@gmail.com");
        driver.findElement(txtPassword).sendKeys("Cp@12345");
        driver.findElement(btnLogin).click();
    }

}
