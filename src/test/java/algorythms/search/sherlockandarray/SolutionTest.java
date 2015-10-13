package algorythms.search.sherlockandarray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetLeftSum() {
        int actual = Solution.getLeftSum(new int[]{1, 2, 3, 4, 5}, 2);
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetRightSum() {
        int actual = Solution.getRightSum(new int[]{1, 2, 3, 4}, 2);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMiddleIndexOdd() {
        int actual = Solution.getMiddleIndex(new int[]{1, 2, 3, 4, 5});
        int expected = 2;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetMiddleIndexEven() {
        int actual = Solution.getMiddleIndex(new int[]{1, 2, 3, 4, 5, 6});
        int expected = 3;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputYes() {
        String actual = Solution.getOutput(new int[]{1, 2, 3});
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNo() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 3});
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputYesIndexRight() {
        String actual = Solution.getOutput(new int[]{1, 2, 3, 4, 5, 6, 15});
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputYesIndexLeft() {
        String actual = Solution.getOutput(new int[]{15, 6, 5, 4, 3, 2, 1});
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

}
