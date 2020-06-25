package testparameterization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Hashtable;

public class ParameterizationWithExcel{

    public static ExcelReader excel = null;

    @Test(dataProvider = "getData")
    public void testData(String email, String firstName, String lastName){//columns names

        System.out.println(email + "----" + firstName + "----" + lastName);
    }

    @DataProvider
    public static Object[][] getData(){

        if (excel == null){
            excel = new ExcelReader("E:\\2 API Webservices testing\\TestNGLearning\\users.xlsx");
        }

        String sheetName = "users";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object[][] data = new Object[rows -1][cols]; //because the first row with titles will not be used

        for (int rowNum = 2; rowNum <= rows; rowNum++){

            for (int colNum = 0; colNum< cols; colNum++){

                data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);
            }
        }

        return data;
    }

    //Hashtable

    @Test(dataProvider = "getDataHashtable")
    public void testData(Hashtable<String,String> data){
        System.out.println(data.get("email") + "----" + data.get("firstName")  + "----" + data.get("lastName"));
    }

    @DataProvider
    public static Object[][] getDataHashtable(){

        if (excel == null){
            excel = new ExcelReader("E:\\2 API Webservices testing\\TestNGLearning\\users.xlsx");
        }

        String sheetName = "users";
        int rows = excel.getRowCount(sheetName);
        int cols = excel.getColumnCount(sheetName);

        Object[][] data = new Object[rows -1][1]; //row -> because the first row with titles will not be used, col -> because 1 parameter is passed in @Test

        Hashtable<String,String> table = null; //Hashtable will be created for every row

        for (int rowNum = 2; rowNum <= rows; rowNum++){

            table = new Hashtable<String, String>();

            for (int colNum = 0; colNum< cols; colNum++){

                //data[rowNum - 2][colNum] = excel.getCellData(sheetName, colNum, rowNum);

                table.put(excel.getCellData(sheetName, colNum, 1), excel.getCellData(sheetName, colNum, rowNum));
                data[rowNum-2][0] = table;
            }
        }

        return data;
    }


}
