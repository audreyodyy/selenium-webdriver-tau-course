package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homepage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.acceptAlert();
        assertEquals(alertsPage.getResults(), "You successfully clicked an alert");

    }
}
