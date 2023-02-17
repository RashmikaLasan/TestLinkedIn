package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver=null;

    @BeforeSuite
    public void initializeWebDriver() throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Desktop\\TestLinkedIn\\src\\main\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        // Implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // To open Rahul Shetty Academy
        driver.get("https://rahulshettyacademy.com/client");
    }

    @AfterSuite
    public void quitDriver() {
        driver.quit();
    }
}