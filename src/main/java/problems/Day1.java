package problems;

import util.InputUtil;

import java.io.IOException;

/**
 * Created by akash on 03/12/17.
 */
public class Day1 {
    public int parseCaptcha(String digits, int nextCount) {
        int sum = 0;
        for (int i = 0; i < digits.length(); i++) {
            char digit = digits.charAt(i);
            char nextDigit = digits.charAt((i + nextCount) % digits.length());
            if (digit == nextDigit) {
                sum += Integer.parseInt(String.valueOf(digit));
            }
        }
        return sum;
    }

    public int parseCaptcha(String digits) {
        return parseCaptcha(digits, 1);
    }

    public int parseCaptchaPart2(String digits) {
        return parseCaptcha(digits, digits.length() / 2);
    }

    public static void main(String[] args) {
        Day1 day1 = new Day1();
        InputUtil inputUtil = new InputUtil();
        String inputPath = day1.getClass().getResource("/Day1Input.txt").getFile();
        try {
            System.out.println("Part 1: " + day1.parseCaptcha(inputUtil.getInput(inputPath)));
            System.out.println("Part 2: " + day1.parseCaptchaPart2(inputUtil.getInput(inputPath)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
