package lessonNew4;

import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
public class PhoneDirectory {
    TreeMap<String, HashSet<String>> directoryList = new TreeMap<>();

    public PhoneDirectory() {

        super();
    }

    public void add(String surname, String phoneNumber) {
        HashSet<String> phones = new HashSet<>();
        if (directoryList.containsKey(surname)) {
            phones = directoryList.get(surname);
        }
        phones.add(phoneNumber.replaceAll(" ", ""));
        directoryList.put(surname, phones);
    }

    public HashSet<String> get(String surname) {
        return directoryList.get(surname);
    }

    public void printPhoneDirectory() {
        System.out.println("---Печать всего телефонного справочника...");
        for(Map.Entry<String, HashSet<String>> entry: directoryList.entrySet()) {
            System.out.print(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
        System.out.println("--------------------------------------");
    }

    public void printPhonesBySurname(String surname) {
        if (directoryList.containsKey(surname)) {
            System.out.println("Телефоны по фамилии '" + surname + "':" + get(surname)) ;
        } else {
            System.out.println("К сожалению, этот телефонный справочник не содержит никакой информации по фамилии '" + surname + "'");
        }
    }
}