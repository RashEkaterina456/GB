package lesson2;

public class MainClass {
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"1","1","1","1"},{"1","1","1","1"}};
        String[][] error_array = {{"1","2","3","4","1"},{"1","2","3","4"}};
        String[][] error_data = {{"1","1","3","4",},{"1","2","аа3","4"}};

        System.out.println("Начало работы программы");
        System.out.println("=======================");

        System.out.println("Случай корректного массива");
        try {
            result = analyze(array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна ");
            System.out.println("=======================");
        }

        System.out.println("Случай некорректного массива");
        try {
            result = 0;
            result = analyze(error_array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна ");
            System.out.println("=======================");
        }

        System.out.println("Случай некорректных данных");
        try {
            result = 0;
            result = analyze(error_data);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Результат суммирования элементов массива равна "+ result);
            System.out.println("=======================");
        }

        System.out.println("Работа программы завершена");
    }

    public static int analyze(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int sum = 0;
        int value = 0;
        int cell = 0;

        if(array.length != 2 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i =1;i<3;i++){
            for(int c=1;c<5;c++){
                cell = c;
                try{
                    value = Integer.parseInt(array[i-1][c-1]);
                    sum += value;
                } catch (IllegalArgumentException e){
                    String message = "в  ряду, "+ cell +" ячейке";
                    throw new MyArrayDataException(message);
                }
            }
        }

        return sum;
    }
}
