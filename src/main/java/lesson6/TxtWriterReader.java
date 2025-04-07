package lesson6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TxtWriterReader {
    private String path = "src/main/java/lesson6/phonebook.txt";

    public Map<String, List<String>> readTxt() {
        Map<String, List<String>> phonebook = new HashMap<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(" ");
                String name = splitLine[0];
                String[] numbers = splitLine[1].split(",");
                for (int i = 0; i < numbers.length; i++) {
                    if (phonebook.containsKey(name)) {
                        List<String> numbersList = phonebook.get(name);
                        numbersList.add(numbers[i]);
                    } else {
                        List<String> numbersList = new ArrayList<>();
                        numbersList.add(numbers[i]);
                        phonebook.put(name, numbersList);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return phonebook;
    }

    public void writeTxt(Map<String, List<String>> phonebookForWrite) {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(path))) {
            for (Map.Entry<String, List<String>> o : phonebookForWrite.entrySet()) {
                writer.write(o.getKey() + " ");
                for (String st : o.getValue()) {
                    writer.write(st + ",");
                }
                writer.write("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
