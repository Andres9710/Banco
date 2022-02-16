package purchase;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.SamsungS6Page;


public class PurchaseTests extends BaseTests {

    @Test
    public void addtheCart(){
        SamsungS6Page samsungS6Page = homePage.clickSamsungS6();
        samsungS6Page.clickToCart();

        //String message = samsungS6Page.getPopUpText();
        //assertEquals(message, "Product added", "Product not added");

    }

}
