package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.TestBase;

public class TestOne extends TestBase {


    @Test
    public void init() throws Exception {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.clickLogin();
    }
}
