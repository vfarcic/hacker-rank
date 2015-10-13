package algorythms.graphtheory.eventree;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SolutionTest {

    private java.util.Map<Integer, java.util.Set<Integer>> map;

    @Before
    public void before() {
        map = new java.util.HashMap<>();
        Solution.addBothToMap(2, 1, map);
        Solution.addBothToMap(3, 1, map);
        Solution.addBothToMap(4, 3, map);
        Solution.addBothToMap(5, 2, map);
        Solution.addBothToMap(6, 1, map);
        Solution.addBothToMap(7, 2, map);
        Solution.addBothToMap(8, 6, map);
        Solution.addBothToMap(9, 8, map);
        Solution.addBothToMap(10, 8, map);
    }

    @Test
    public void testCountChildren() {
        int actual = Solution.countChildren(map, 1, 6);
        int expected = 4;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(map);
        String expected = "2";
        Assert.assertEquals(expected, actual);
    }

}
