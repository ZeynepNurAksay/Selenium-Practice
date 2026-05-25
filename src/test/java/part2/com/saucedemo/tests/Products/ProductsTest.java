package part2.com.saucedemo.tests.Products;

import com.saucedemo.pages.ProductsPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import part2.com.saucedemo.base.BaseTest;

public class ProductsTest extends BaseTest {

    @Test
    public void testProductsHeaderIsDisplayed() {
        ProductsPage productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");
        Assert.assertTrue(productsPage.isProductsHeaderDisplayed());
    }

}
