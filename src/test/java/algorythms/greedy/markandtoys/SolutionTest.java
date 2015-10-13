package algorythms.greedy.markandtoys;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class SolutionTest {

    @Test
    public void testGetOutputNoDuplicates() {
        Map<Integer, Integer> toys = new TreeMap<>();
        toys.put(1, 1);
        toys.put(12, 1);
        toys.put(5, 1);
        toys.put(111, 1);
        toys.put(200, 1);
        toys.put(1000, 1);
        toys.put(10, 1);
        String actual = Solution.getOutput(toys, 50);
        String expected = "4";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputDuplicates() {
        Map<Integer, Integer> toys = new TreeMap<>();
        toys.put(1, 3);
        toys.put(12, 1);
        toys.put(5, 1);
        toys.put(111, 1);
        toys.put(200, 1);
        toys.put(1000, 1);
        toys.put(10, 1);
        String actual = Solution.getOutput(toys, 50);
        String expected = "6";
        Assert.assertEquals(expected, actual);
    }

}
