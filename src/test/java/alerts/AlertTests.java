package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTests extends BaseTests {
    @Test
    public void testAcceptAlert(){
        var alertsPage = homepage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You successfully clicked an alert");

    }

    @Test
    public void testGetTextFromAlert(){
        var alertsPage = homepage.clickJSAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        assertEquals(text, "I am a JS Confirm", "Alert text is incorrect");
    }

    @Test
    public void testInputFromAlert(){
        var alertsPage = homepage.clickJSAlerts();
        alertsPage.triggerPrompt();
        String text = "Hello World!";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        assertEquals(alertsPage.getResults(), "You entered: " + text, "Input is incorrect");
    }
}
