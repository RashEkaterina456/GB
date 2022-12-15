package lessonNew4;

import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] strArray = {"один", "три", "три", "два", "три", "четыре", "четыре", "пять", "пять", "два", "четыре", "четыре", "пять", "пять", "пять"};
        printUniqueStrings(strArray);
        printNumberDuplicateStrings(strArray);

        PhoneDirectory directory = new PhoneDirectory();
        directory.add("Родионов","+375(44) 211-70-41");
        directory.add("Родионов","+375(33) 531-31-00");
        directory.add("Шеина","+375(29) 525-12-41");
        directory.add("Шеина","+375(29) 525-12-41");
        directory.printPhonesBySurname("Родионов");
        directory.printPhonesBySurname("Шеина");
        directory.printPhoneDirectory();
        directory.printPhonesBySurname("Рашитова");
    }

    public static void printUniqueStrings(String[] strArray) {
        TreeSet<String> strHashSet = new TreeSet<>(Arrays.asList(strArray));
        System.out.println(strHashSet);
    }

    public static void printNumberDuplicateStrings(String[] strArray) {
        ArrayList<String> arrayStrList = new ArrayList<>(Arrays.asList(strArray));
        Collections.sort(arrayStrList);
        System.out.println("Информация о дубликатах в следующем массиве " + arrayStrList + ":");
        String checkingWord = "";
        for (String strElement: arrayStrList) {
            if (!checkingWord.equals(strElement)) {
                checkingWord = strElement;
                System.out.println(strElement + " is met " + Collections.frequency(arrayStrList, strElement) + " times");
            }
        }
    }
}