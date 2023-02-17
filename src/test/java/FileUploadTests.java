import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        var uploadPage = homepage.clickFileUpload();
        uploadPage.uploadFile("C:/Users/audre/IdeaProjects/selenium-webdriver-tau/resources/chromedriver.exe");
        assertEquals(uploadPage.getUploadedFile(), "chromedriver.exe", "Uploaded file is incorrect");
    }

}
