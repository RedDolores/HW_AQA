package lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // start Task 1
        ArrayList<String> wordsList = new ArrayList<>();
        wordsList.add("Dog");
        wordsList.add("Cat");
        wordsList.add("Bird");
        wordsList.add("Dog");
        wordsList.add("Cow");
        wordsList.add("Fish");
        wordsList.add("Pig");
        wordsList.add("Cat");
        wordsList.add("Bird");
        wordsList.add("Dog");

        Set<String> wordsSetList = new HashSet<>(wordsList);
        System.out.println(wordsSetList);

        HashMap<String, Integer> countWords = new HashMap<>();
        for (String item : wordsList) {
            countWords.put(item, countWords.getOrDefault(item, 0) + 1);
        }
        for (Map.Entry<String, Integer> o : countWords.entrySet()) {
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        // end Task 1

        AppPhonebook appPhonebook = new AppPhonebook();
        appPhonebook.start();


    }
}
