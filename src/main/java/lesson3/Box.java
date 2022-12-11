package lesson3;

import java.util.ArrayList;
public class Box <T extends Fruit> {
    private final ArrayList<T> fruits;

    public Box(ArrayList<T> fruits) {

        this.fruits = fruits;
    }
    public double getWeight() {
        double fullBoxWeight = 0;
        if (fruits != null && !fruits.isEmpty()) {
            for (T fruit : fruits) {
                fullBoxWeight += fruit.getWeight();
            }
        }
        return fullBoxWeight;
    }
    public <Y extends Fruit> boolean compare(Box<Y> another) {

        return this.getWeight() == another.getWeight();
    }
    public void pourAllFruits(Box<T> another) {
        for (T fruit : this.fruits) {
            another.addFruit(fruit);
        }
        this.fruits.clear();
        this.fruits.trimToSize();
    }
    public void addFruit(T newFruit) {

        fruits.add(newFruit);
    }
}
