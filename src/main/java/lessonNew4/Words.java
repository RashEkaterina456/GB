package lessonNew4;

import java.util.*;

public class Words {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Шкаф", "Зеркало", "Стул", "Стол", "Кресло",
                "Диван", "Окно", "Кровать", "Стол", "Кресло",
                "Зеркало", "Стул", "Стол", "Окно", "Окно",
                "Стул", "Стол", "Окно", "Окно", "Стол"
        );

        Set<String> unique = new HashSet<>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words);
        System.out.println("Уникальные слова");
        System.out.println(unique);
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
