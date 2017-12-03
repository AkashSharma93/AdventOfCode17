package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by akash on 03/12/17.
 */
public class InputUtil {
    public String getInput(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        StringBuffer input = new StringBuffer();
        String line = "";
        while ((line = reader.readLine()) != null) {
            input.append(line);
        }
        reader.close();
        return input.toString();
    }

    public List<List<Integer>> readMatrix(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)));
        List<List<Integer>> matrix = new ArrayList<>();
        String line = "";
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\\s+");
            List<Integer> row = Arrays.asList(tokens).stream().map((token) -> Integer.parseInt(token)).collect(Collectors.toList());
            matrix.add(row);
        }
        reader.close();
        return matrix;
    }
 }
