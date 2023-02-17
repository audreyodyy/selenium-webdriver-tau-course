package contextMenu;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {
    @Test
    public void testContextMenu(){
        var contextMenu = homepage.clickContextMenu();
        contextMenu.rightClickOnTheBox();
        String alertMessage = contextMenu.getAlertText();
        assertEquals(alertMessage, "You selected a context menu", "Alert message is incorrect");
    }
}
