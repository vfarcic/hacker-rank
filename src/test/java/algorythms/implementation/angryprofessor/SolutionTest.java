package algorythms.implementation.angryprofessor;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testOutput() {
        String actual = Solution.getOutput(3, new int[]{-1, -3, 4, 2});
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLessStudents() {
        String actual = Solution.getOutput(2, new int[]{-1, 1, 2});
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMoreStudents() {
        String actual = Solution.getOutput(2, new int[]{-1, -2, -3, 1, 2});
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMinStudents() {
        String actual = Solution.getOutput(2, new int[]{-1, -2, 0, 1});
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

}
