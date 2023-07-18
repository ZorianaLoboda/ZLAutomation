package Priority;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class Priority2 {

    @Test(priority = 1, dataProvider = "testMethods")
    public void testMethod(String methodName) {
        System.out.println("Running Test " + methodName);
    }

    @DataProvider(name = "testMethods")
    public Object[] provideTestMethods() {
        List<String> testMethods = Arrays.asList("g", "f", "e", "d", "c", "b", "a");
        return testMethods.toArray();
    }
}
