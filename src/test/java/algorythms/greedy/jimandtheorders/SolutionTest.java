package algorythms.greedy.jimandtheorders;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SolutionTest {

    @Test
    public void testGetOutput1() {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        map.put(4, new LinkedList<Integer>(Arrays.asList(new Integer[]{1})));
        map.put(5, new LinkedList<Integer>(Arrays.asList(new Integer[]{2})));
        map.put(6, new LinkedList<Integer>(Arrays.asList(new Integer[]{3})));
        String actual = Solution.getOutput(map);
        String expected = "1 2 3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutput2() {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        map.put(9, new LinkedList<Integer>(Arrays.asList(new Integer[]{1})));
        map.put(6, new LinkedList<Integer>(Arrays.asList(new Integer[]{2})));
        map.put(11, new LinkedList<Integer>(Arrays.asList(new Integer[]{3})));
        map.put(4, new LinkedList<Integer>(Arrays.asList(new Integer[]{4})));
        map.put(7, new LinkedList<Integer>(Arrays.asList(new Integer[]{5})));
        String actual = Solution.getOutput(map);
        String expected = "4 2 5 1 3";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputSameTime() {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        map.put(2, new LinkedList<Integer>(Arrays.asList(new Integer[]{1, 2, 3})));
        String actual = Solution.getOutput(map);
        String expected = "1 2 3";
        Assert.assertEquals(expected, actual);
    }

}
