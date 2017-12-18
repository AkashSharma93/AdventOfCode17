package problems;

import util.InputUtil;

import java.io.File;
import java.io.IOException;
import java.util.*;

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

    public int getNumOfValidPassphrasesPart2(List<String> passphrases) {
        int validCount = 0;
        for (String passphrase: passphrases) {
            if (isValidPart2(passphrase)) validCount++;
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

    public boolean isValidPart2(String passphrase) {
        if (!isValid(passphrase)) return false;

        String[] tokens = passphrase.split("\\s+");
        for (int i = 0; i < tokens.length - 1; i++) {
            for (int j = i + 1; j < tokens.length; j++) {
                if (isAnagram(tokens[i], tokens[j])) return false;
            }
        }
        return true;
    }

    public boolean isAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) return false;

        Map<Character, Integer> charMap = new HashMap<>();
        for (char c: input1.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for (char c: input2.toCharArray()) {
            if (charMap.containsKey(c)) {
                int count = charMap.get(c);
                if (count <= 0) return false;   // Not an anagram.
                charMap.put(c, count - 1);
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Day4 day4 = new Day4();
        InputUtil inputUtil = new InputUtil();
        String inputPath = day4.getClass().getResource(File.separator + "Day4Input.txt").getFile();
        try {
            List<String> inputLines = inputUtil.getInputLines(inputPath);
            System.out.println(day4.getNumOfValidPassphrasesPart2(inputLines));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
