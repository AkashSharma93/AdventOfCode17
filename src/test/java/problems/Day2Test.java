package problems;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by akash on 03/12/17.
 */
public class Day2Test {
    Day2 day2;
    List<List<Integer>> spreadsheet;

    @BeforeMethod
    public void setUp() throws Exception {
        day2 = new Day2();
        spreadsheet = new ArrayList<>();
        spreadsheet.add(Arrays.asList(5, 1, 9, 5));
        spreadsheet.add(Arrays.asList(7, 5, 3));
        spreadsheet.add(Arrays.asList(2, 4, 6, 8));

    }

    @Test
    public void testCalculateChecksum() throws Exception {
        Assert.assertEquals(day2.calculateChecksum(spreadsheet), 18);
    }

    @Test
    public void testGetHighLowDifference() throws Exception {
        Assert.assertEquals(day2.getHighLowDifference(spreadsheet.get(0)), 8);
        Assert.assertEquals(day2.getHighLowDifference(spreadsheet.get(1)), 4);
        Assert.assertEquals(day2.getHighLowDifference(spreadsheet.get(2)), 6);
    }

}