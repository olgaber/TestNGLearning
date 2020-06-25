package regression;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCase2 {
    @Test
    public void validateTitles(){

        System.out.println("Beginning");
        String expected_title = "Yahoo.com";//from spec in xls
        String actual_title = "Gmail.com"; //selenium

        SoftAssert softAssert = new SoftAssert();

        if (expected_title.equals(actual_title)){
            System.out.println("TC pass");
        } else
            System.out.println("TC fail");
        System.out.println("Validating title: ");
        softAssert.assertEquals(actual_title, expected_title);

        System.out.println("Validating image: ");
        softAssert.assertEquals(true, false, "image not present");

        System.out.println("Validating textbox presence: ");
        softAssert.assertEquals(true, false, "text box not present");

        System.out.println("Ending");

        softAssert.assertAll();
    }

}
