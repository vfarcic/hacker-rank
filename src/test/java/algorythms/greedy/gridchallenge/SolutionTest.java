package algorythms.greedy.gridchallenge;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutputYes() {
        String actual = Solution.getOutput(new char[][] {
                "ebacd".toCharArray(),
                "fghij".toCharArray(),
                "olmkn".toCharArray(),
                "trpqs".toCharArray(),
                "xywuv".toCharArray()
        });
        String expected = "YES";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputNo() {
        String actual = Solution.getOutput(new char[][] {
                "ebacd".toCharArray(),
                "fghij".toCharArray(),
                "olmkn".toCharArray(),
                "zzzzz".toCharArray(),
                "xywuv".toCharArray()
        });
        String expected = "NO";
        Assert.assertEquals(expected, actual);
    }

}
