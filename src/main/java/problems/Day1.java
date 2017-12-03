package problems;

import util.InputUtil;

import java.io.File;
import java.io.IOException;

/**
 * Created by akash on 03/12/17.
 */
public class Day1 {
    public int parseCaptcha(String digits) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            char nextDigit = digits.charAt((i + 1) % digits.length());
            if (digit == nextDigit) {
                sum += Integer.parseInt(String.valueOf(digit));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Day1 day1 = new Day1();
        InputUtil inputUtil = new InputUtil();
        String inputPath = day1.getClass().getResource(File.separator + "Day1Input.txt").getFile();
        try {
            System.out.println(day1.parseCaptcha(inputUtil.getInput(inputPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
