package algorythms.implementation.sherlockandthebeast;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        String actual = Solution.getOutput(1);
        String expected = "-1";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        String actual = Solution.getOutput(3);
        String expected = "555";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        String actual = Solution.getOutput(5);
        String expected = "33333";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test11() {
        String actual = Solution.getOutput(11);
        String expected = "55555533333";
        Assert.assertEquals(expected, actual);
    }

}
