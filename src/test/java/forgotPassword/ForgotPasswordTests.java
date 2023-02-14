package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homepage.clickForgotPassword();
        var emailSentPage = forgotPasswordPage.retrievePassword("tau@example.com");
        assertEquals(emailSentPage.getMessage(), "Your e-mail's been sent!", "Message is incorrect");
    }
}
