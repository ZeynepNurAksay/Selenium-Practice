package part3_4.com.demoqa.test.part3.elements;

import com.demoqa.pages.elements.WebTablePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class WebTableTest extends BaseTest {

    @Test
    public void testGetDataFromTable() {
        var webTablePage = homePage.goToElements().clickWebTable();
        Assert.assertEquals(webTablePage.getAge("alden@example.com"), "45");
    }

    @Test
    public void testEditDataInTable() {
        var webTablePage = homePage.goToElements().clickWebTable();
        webTablePage.clickEditButton("alden@example.com");
        webTablePage.editAge("24");
        webTablePage.clickSubmitButton();
        Assert.assertEquals(webTablePage.getAge("alden@example.com"), "24");
    }

}
