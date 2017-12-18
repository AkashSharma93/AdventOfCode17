package problems;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

/**
 * Created by akash on 18/12/17.
 */
public class Day4Test {
    Day4 day4;
    String[] passphrases = {"aa bb cc dd ee", "aa bb cc dd aa", "aa bb cc dd aaa"};
    String[] passphrases2 = {"abcde fghij", "abcde xyz ecdab", "a ab abc abd abf abj", "iiii oiii ooii oooi oooo", "oiii ioii iioi iiio"};

    @BeforeMethod
    public void setUp() throws Exception {
        day4 = new Day4();
    }

    @Test
    public void testGetNumOfValidPassphrases() throws Exception {
        Assert.assertEquals(day4.getNumOfValidPassphrases(Arrays.asList(passphrases)), 2);
    }

    @Test
    public void testIsValid() throws Exception {
        Assert.assertTrue(day4.isValid(passphrases[0]));
        Assert.assertFalse(day4.isValid(passphrases[1]));
        Assert.assertTrue(day4.isValid(passphrases[2]));
    }

    @Test
    public void testGetNumOfValidPassphrasesPart2() throws Exception {
        Assert.assertEquals(day4.getNumOfValidPassphrasesPart2(Arrays.asList(passphrases2)), 3);
    }

    @Test
    public void testIsValidPart2() throws Exception {
        Assert.assertTrue(day4.isValidPart2(passphrases2[0]));
        Assert.assertFalse(day4.isValidPart2(passphrases2[1]));
        Assert.assertTrue(day4.isValidPart2(passphrases2[2]));
        Assert.assertTrue(day4.isValidPart2(passphrases2[3]));
        Assert.assertFalse(day4.isValidPart2(passphrases2[4]));
    }

    @Test
    public void testIsAnagram() throws Exception {
        Assert.assertTrue(day4.isAnagram("abcde", "ecdab"));
        Assert.assertTrue(day4.isAnagram("oiii", "ioii"));
    }

}