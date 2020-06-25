package parallelTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Date;

public class TestParallelDP {

    @Test(dataProvider = "getData")
    public void doLogin(String browser) throws InterruptedException {

        Date d = new Date();
        System.out.println("Browser name: " + browser + " -- " + d);
        Thread.sleep(2000);

    }

     @DataProvider(parallel = true)
     public static Object[][] getData(){

            Object[][] data = new Object[2][1];

            // 1st row
            data[0][0] ="firefox";

            // 2nd row
            data[1][0] ="chrome";

        return data;
    }

}
