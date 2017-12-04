package problems;

import util.InputUtil;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;

/**
 * Created by akash on 03/12/17.
 */
public class Day2 {
    public int calculateChecksum(List<List<Integer>> spreadsheet) {
        return spreadsheet.stream()
                .map((row) -> getHighLowDifference(row))
                .mapToInt(Integer::intValue)
                .sum();
    }

    public int getHighLowDifference(List<Integer> row) {
        int max = row.stream().max(Comparator.naturalOrder()).get();
        int min = row.stream().min(Comparator.naturalOrder()).get();
        return max - min;
    }

    public static void main(String[] args) {
        Day2 day2 = new Day2();
        InputUtil inputUtil = new InputUtil();
        String inputPath = day2.getClass().getResource("/Day2Input.txt").getFile();
        try {
            List<List<Integer>> spreadsheet = inputUtil.readMatrix(inputPath);
            System.out.println(day2.calculateChecksum(spreadsheet));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
