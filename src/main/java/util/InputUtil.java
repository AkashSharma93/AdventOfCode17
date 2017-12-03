package util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

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
}
