package tests;

import com.example.automation.framework.BaseTest;
import com.example.automation.framework.pages.InventoryPage;
import com.example.automation.framework.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin() {
        LoginPage login = new LoginPage();
        InventoryPage inventory = new InventoryPage();

        login.login("standard_user", "secret_sauce");

        Assert.assertEquals(inventory.getInventoryTitle(), "Products");
    }
}
