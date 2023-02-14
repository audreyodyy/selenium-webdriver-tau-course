package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTests extends BaseTests {
    @Test
    public void testBackspace(){
        var keyPage = homepage.clickKeyPresses();
        keyPage.enterText("X" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
    }

//    @Test
//    public void testPhi(){
//        var keyPage = homepage.clickKeyPresses();
//        keyPage.enterPhi();
//    }


}
