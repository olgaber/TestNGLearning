package regression;

import org.testng.annotations.*;

public class TestCase1 {

    @BeforeTest
    public void createDBConnection(){
        System.out.println("Creating db conn");
    }

    @AfterTest
    public void closeDBConnection(){
        System.out.println("Closing db conn");
    }

    @BeforeMethod
    public void launchBrowser(){
        System.out.println("Launching browser");
    }

    @AfterMethod
    public void closeBrowser(){
        System.out.println("Closing browser");
    }

    @Test(priority = 2)
    public void doLogin(){

        try{
            System.out.println("Executing login test");
        }
        catch (Throwable t){
            System.out.println("Capture Screenshot");
        }
    }

    @Test(priority = 1)
    public void doUserReg(){
        System.out.println("Executing user registration test");
    }




}
