package lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayMethodsGeneric<Integer> gen1 = new ArrayMethodsGeneric<>(7, 10, 1, 4, 9);
        gen1.printArray();
        gen1.swapArrayElements(0, 4);
        gen1.printArray();

        ArrayMethodsGeneric<String> gen2 = new ArrayMethodsGeneric<>("string1", "string2", "string3", "string4", "string5");
        gen2.printArray();
        gen2.swapArrayElements(1, 2);
        gen2.printArray();

        Box<Apple> appleBox = new Box<>(new ArrayList<>(Arrays.asList(new Apple(), new Apple(), new Apple(), new Apple())));
        Box<Orange> orangeBox = new Box<>(new ArrayList<>(Arrays.asList(new Orange(), new Orange(), new Orange())));
        System.out.println("Вес коробки с яблоками: " + appleBox.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());
        System.out.println("Одинаков ли вес коробок с апельсинами и яблоками?: " + orangeBox.compare(appleBox));

        orangeBox.addFruit(new Orange());
        System.out.println("Вес коробки с апельсинами после добавления в нее одного апельсина: " + orangeBox.getWeight());

        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        System.out.println("Вес коробки с яблоками после того, как в нее были добавлены два яблока: " + appleBox.getWeight());
        System.out.println("Одинаков ли вес коробок с апельсинами и яблоками после всех манипуляций?: " + orangeBox.compare(appleBox));

        Box<Orange> anotherOrangeBox = new Box<>(new ArrayList<>(List.of(new Orange())));
        System.out.println("Вес новой коробки с апельсинами: " + anotherOrangeBox.getWeight());
        orangeBox.pourAllFruits(anotherOrangeBox);
        System.out.println("Вес первой коробки с апельсинами после пересыпания (она должна быть пустой): " + orangeBox.getWeight());
        System.out.println("Вес второй новой коробки с апельсинами после пересыпания (ее вес должен увеличиться): " + anotherOrangeBox.getWeight());
    }
}
