package algorythms.search.maximisesum;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testGetOutputSubArrayAtBeginning() {
        String actual = Solution.getOutput(new int[]{3, 3, 9, 9, 5}, 7);
        String expected = "6";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputSubArrayAtMiddle() {
        String actual = Solution.getOutput(new int[]{3, 3, 9, 9, 5}, 20);
        String expected = "18";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputSubArrayAtEnd() {
        String actual = Solution.getOutput(new int[]{3, 3, 9, 9, 5}, 15);
        String expected = "14";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputSubArrayOneDigit() {
        String actual = Solution.getOutput(new int[]{3, 3, 9, 9, 5}, 10);
        String expected = "9";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputModuloNotFound() {
        String actual = Solution.getOutput(new int[]{3, 3, 9, 9, 5}, 3);
        String expected = "0";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetOutputBigNumbers() {
        String actual = Solution.getOutput(new int[]{
                846930887,
                1681692778,
                1714636916,
                1957747794,
                424238336,
                719885387,
                1649760493,
                596516650,
                1189641422,
                1025202363,
                1350490028,
                783368691,
                1102520060,
                2044897764,
                1967513927,
                1365180541,
                1540383427,
                304089173,
                1303455737,
                35005212,
                521595369,
                294702568,
                1726956430,
                336465783,
                861021531,
                278722863,
                233665124,
                2145174068,
                468703136,
                1101513930,
                1801979803,
                1315634023,
                635723059,
                1369133070,
                1125898168,
                1059961394,
                2089018457,
                628175012,
                1656478043,
                1131176230,
                1653377374,
                859484422,
                1914544920,
                608413785,
                756898538,
                1734575199,
                1973594325,
                149798316,
                2038664371,
                1129566414
        }, 1804289384);
        String expected = "1802192837";
        Assert.assertEquals(expected, actual);
    }

}
