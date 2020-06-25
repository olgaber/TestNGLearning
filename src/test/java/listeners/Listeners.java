package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

    public void onTestFailure(ITestResult result) {

        Reporter.log("<a href='E:\\Photos\\photo3.jpg' target='_blank'>Screenshot link </a> ");
        Reporter.log("<br>");
        Reporter.log("<a href='E:\\Photos\\photo3.jpg' target='_blank'><img height = 150 width = 200 src='E:\\Photos\\photo3.jpg'></a> ");
        System.out.println("Capturing screenshot for the FAILED test - " + result.getTestName());
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println("Test PASSED - " + result.getTestName());
    }
}
