package Grouping;

import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class Groups {

    @Test(groups = "first", priority = 1)
    public void One() {
        assertTrue(true);
    }

    @Test(groups = "second", priority = 2)
    public void Two() {
        assertTrue(true);
    }

    @Test(groups = "first", priority = 3)
    public void Three() {
        assertTrue(true);
    }

    @Test(groups = "second", priority = 4)
    public void Four() {
        assertTrue(true);
    }

    @Test(groups = "first", priority = 5)
    public void Five() {
        assertTrue(true);
    }

    @Test(groups = "second", priority = 6)
    public void Six() {
        assertTrue(true);
    }

    @Test(groups = "first", priority = 7)
    public void Seven() {
        assertTrue(true);
    }

    @Test(groups = "second", priority = 8)
    public void Eight() {
        assertTrue(true);
    }
}
