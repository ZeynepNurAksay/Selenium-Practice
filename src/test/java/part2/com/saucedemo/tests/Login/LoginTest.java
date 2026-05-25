package part2.com.saucedemo.tests.Login;

import com.saucedemo.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("abc");
        loginPage.setPassword("123");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertTrue(actualErrorMessage.contains("Epic sadface"));
    }

}
