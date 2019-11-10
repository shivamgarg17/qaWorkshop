package tests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import pages.workshop;
import utility.jsonReader;

import java.util.Map;

//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class testScenario extends setup {
    workshop shop = new workshop(driver);
    static Map<String, String> data = jsonReader.getData();

    @Test
    public void A_verifyTitle() {
        shop.assertTitle("Food Lookup Demo");
    }

    @Test
    public void searchAndAdditem() {
        shop.writeText("milk");
        shop.additem();
        shop.navigateSearch();
        shop.deleteProduct();

    }

}
