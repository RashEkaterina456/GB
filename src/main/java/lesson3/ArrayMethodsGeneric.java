package lesson3;
public class ArrayMethodsGeneric <T> {
    T[] array;
    @SafeVarargs
    public ArrayMethodsGeneric(T...array) {

        this.array = array;
    }
    public void swapArrayElements(int firstElementIndex, int secondElementIndex) {
        try {
            T temporal = array[firstElementIndex];
            array[firstElementIndex] = array[secondElementIndex];
            array[secondElementIndex] = temporal;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Неправильные индексы элементов. Невозможно поменять местами элементы массива.");
        }
    }
    public void printArray() {
        for (T element: array) {
            System.out.print(element.toString() + " ");
        }
        System.out.println();
    }
}

