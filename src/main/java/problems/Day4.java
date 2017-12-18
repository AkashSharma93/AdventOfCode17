package problems;

import util.InputUtil;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by akash on 18/12/17.
 */
public class Day4 {
    public int getNumOfValidPassphrases(List<String> passphrases) {
        int validCount = 0;
        for (String passphrase: passphrases) {
            if (isValid(passphrase)) validCount++;
        }
        return validCount;
    }

    public boolean isValid(String passphrase) {
        String[] tokens = passphrase.split("\\s+");
        Set<String> words = new HashSet<>();
        for (String token: tokens) {
            if (words.contains(token)) return false;
            words.add(token);
        }
        return true;
    }

    public static void main(String[] args) {
        Day4 day4 = new Day4();
        InputUtil inputUtil = new InputUtil();
        String inputPath = day4.getClass().getResource(File.separator + "Day4Input.txt").getFile();
        try {
            List<String> inputLines = inputUtil.getInputLines(inputPath);
            System.out.println(day4.getNumOfValidPassphrases(inputLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
