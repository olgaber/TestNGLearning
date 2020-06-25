package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestSkip {

    @Test
    public void isSkipped(){

        throw new SkipException("Skipping the test as the condition is not met");

    }
}
