package algorythms.dynamicprogramming.fibonaccimodified;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class SolutionTest {

    @Test
    public void testGetNext0And1() {
        BigInteger actual = Solution.getNext(BigInteger.ZERO, BigInteger.ONE);
        BigInteger expected = BigInteger.ONE;
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testGetNext1And2() {
        BigInteger actual = Solution.getNext(BigInteger.ONE, BigInteger.valueOf(2));
        BigInteger expected = BigInteger.valueOf(5);
        Assert.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testGetOutput() {
        String actual = Solution.getOutput(BigInteger.ZERO, BigInteger.ONE, 5);
        String expected = "5";
        Assert.assertEquals(expected, actual);
    }

}
