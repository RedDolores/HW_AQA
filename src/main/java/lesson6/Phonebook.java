package lesson6;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook;

    public Phonebook(Map<String, List<String>> phonebook) {
        this.phonebook = phonebook;
    }

    public Map<String, List<String>> getPhonebook() {
        return phonebook;
    }

    public void addContact(String name, String number) {

        if (phonebook.containsKey(name)) {
            List<String> numbers = phonebook.get(name);
            numbers.add(number);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(number);
            phonebook.put(name, numbers);
        }
        System.out.println();
    }

    public void getContact(String name) {
        if (phonebook.containsKey(name)) {
            System.out.printf("%s: %s", name, phonebook.get(name));
            System.out.println();
        } else {
            System.out.println("Такого контакта нет");
        }
        System.out.println();
    }

    public void printPhoneBook() {
        TreeMap<String, List<String>> sortedPhonebook = new TreeMap<>(phonebook);
        for(Map.Entry<String, List<String>> o : sortedPhonebook.entrySet()){
            System.out.println(o.getKey() + ": " + o.getValue());
        }
        System.out.println();
    }

}
