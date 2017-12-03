import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import problems.Day1;

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

}