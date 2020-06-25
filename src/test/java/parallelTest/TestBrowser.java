package parallelTest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Date;

public class TestBrowser {

    @Parameters({"browser"})
    @Test
    public void doLogin(String browser) throws InterruptedException {

        Date d = new Date();
        System.out.println("Browser name: " + browser + " -- " + d);
        Thread.sleep(2000);

    }
}
