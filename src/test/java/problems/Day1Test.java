package problems;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by akash on 03/12/17.
 */
public class Day1Test {
    Day1 day1;

    @BeforeMethod
    public void setUp() {
        day1 = new Day1();
    }

    @Test
    public void test1() {
        Assert.assertEquals(day1.parseCaptcha("1122"), 3);
    }

    @Test
    public void test2() {
        Assert.assertEquals(day1.parseCaptcha("1111"), 4);
    }

    @Test
    public void test3() {
        Assert.assertEquals(day1.parseCaptcha("1234"), 0);
    }

    @Test
    public void test4() {
        Assert.assertEquals(day1.parseCaptcha("91212129"), 9);
    }

    @Test
    public void p2Test1() {
        Assert.assertEquals(day1.parseCaptchaPart2("1212"), 6);
    }

    @Test
    public void p2Test2() {
        Assert.assertEquals(day1.parseCaptchaPart2("1221"), 0);
    }

    @Test
    public void p2Test3() {
        Assert.assertEquals(day1.parseCaptchaPart2("123425"), 4);
    }

    @Test
    public void p2Test4() {
        Assert.assertEquals(day1.parseCaptchaPart2("123123"), 12);
    }

    @Test
    public void p2Test5() {
        Assert.assertEquals(day1.parseCaptchaPart2("12131415"), 4);
    }
}