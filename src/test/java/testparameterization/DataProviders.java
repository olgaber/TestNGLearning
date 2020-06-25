package testparameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviders {

    @DataProvider(name = "dp1")
    public static Object[][] getData(Method m){

        Object[][] data = null;

        if(m.getName().equals("testLogin")){

            data = new Object[2][2];

            // 1st row
            data[0][0] ="sampleuser1";
            data[0][1] = "abcdef";

            // 2nd row
            data[1][0] ="testuser2";
            data[1][1] = "zxcvb";
        } else if (m.getName().equals("testUserReg")){
            data = new Object[2][3];

            // 1st row
            data[0][0] ="sampleuser1";
            data[0][1] = "abcdef";
            data[0][2] = "abcdef@email.com";

            // 2nd row
            data[1][0] ="testuser2";
            data[1][1] = "zxcvb";
            data[1][2] = "abcdef@email.com";
        }
        return data;
    }

//    @DataProvider(name = "dp2")
//    public static Object[][] getData(){
//
//            Object[][] data = new Object[2][3];
//
//            // 1st row
//            data[0][0] ="sampleuser1";
//            data[0][1] = "abcdef";
//            data[0][2] = "abcdef@email.com";
//
//            // 2nd row
//            data[1][0] ="testuser2";
//            data[1][1] = "zxcvb";
//            data[1][2] = "abcdef@email.com";
//
//        return data;
//    }


}
