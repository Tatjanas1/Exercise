package Java_advance;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.function.ToIntFunction;

public class HW4_1 {
    public static void main(String[] args) {
        /**
         *  Task 1
         */

        int task = 1;
        String line="_______________________________________";
        System.out.println(line + "\n Task " + task++);

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        System.out.println(Arrays.stream(array).sum());
        // System.out.println(9 + 2 + 6 + 4 + 5 + 12 + 7 + 8 + 6);

        int sum = 0;
        // цикл для обхода каждого элемента массива
        for( int num : array) {
            // суммирование каждого элемента массива
            sum = sum + num;
        }

        System.out.println("Сумма элементов массива равна = " + sum);

        System.out.println(Arrays.stream(array).summaryStatistics());

        System.out.println(Arrays.toString(array));

        /**
         *  Task 2
         */

        System.out.println(line + "\n Task " + task++);
        System.out.println("максимальное значение массива = " + Arrays.stream(array).max());

        int i=0;
        int x = Integer.MIN_VALUE;
        while (i<array.length){
            if (array[i] > x) {
                x = array[i];
                i = i + 1;
            } else {
                i = i + 1;
            }
        }

        System.out.println("максимальное значение массива = " + x);
        int x2 = array[0];
        for (i=0; i<array.length; i = i + 1){
            if (x2 < array[i]){
                x2 = array[i];
            }
        }
        System.out.println("максимальное значение массива = " + x2);

        /**
         *  Task 3
         */

        System.out.println(line + "\n Task " + task++);
        System.out.println("минимальное значение массива = " + Arrays.stream(array).min());

        i = 0;
        x = Integer.MAX_VALUE;
        do{
            if (array[i] < x){
                x = array [i];
            }
            i = i + 1;
        } while (i < array.length);
        System.out.println("минимальное значение массива = " + x);

        /**
         *  Task 4
         */

        int[] array4 = {1, 2, 3, 4, 5, 6, 7, 8, 10};

        double sum4 = 0;
        for (i=0; i<array4.length; i = i + 1){
            sum4 = sum4 + array4[i];
        }

        System.out.println(line + "\n Task " + task++);
        System.out.println("среднее арифметическое всех значений массива = " + (sum4/array4.length));

        System.out.println("среднее арифметическое всех значений массива = " + Arrays.stream(array4).average());


        /**
         * что значит/ чем отличается OptionalDouble от Double ? почему нельзя с просто Double?
         */

        OptionalDouble result = Arrays.stream(array4).average();
        System.out.println("среднее арифметическое всех значений массива = " + result);

        /**
         *  Task 5
         */

        int[][] array5 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        sum = 0;
        for (i=0; i < array5.length; i = i + 1){
            for (int j = 0; j < array5[i].length; j = j+1){
                sum = sum + array5[i][j];
            }
        }

        System.out.println(line + "\n Task " + task++);
        System.out.println("сумму элементов массива = " + sum);

        /**
        Как с помощью методов посчитать среднюю многомерного массива?
         */

        // System.out.println(Arrays.deepToString(array5));
        //System.out.println(Arrays.stream(array5).count());


        /**
         *  Task 6
         */

        System.out.println(line + "\n Task " + task++);

        int[][] array6 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        for(i = 0; i < array6.length; i = i + 1) {
           System.out.println("максимальное значение " + i + " элемента массива = " + Arrays.stream(array6[i]).max());
            }

        int n = 0;
        for(i = 0; i < array6.length; i = i + 1) {
            for (int j = 0; j < array6[i].length; j = j + 1) {
                n = n + 1;
            }
        }
        int count = 0;
        for(i = 0; i < array6.length; i = i + 1) {
            count = count + array6[i].length;
        }
        System.out.println("количество элементов массива = " + count);

        int [] secarray = new int[n];

        for(i = 0, n = 0; i < array6.length; i = i + 1) {
            for (int j = 0; j < array6[i].length; j = j + 1){
                secarray [n] = array6 [i][j];
                n = n + 1;
            }
        }

        System.out.println(Arrays.toString(secarray));
        System.out.println("максимальное значение массива = " + Arrays.stream(secarray).max());

        /**
         Как с помощью методов посчитать длину многомерного массива?
         Как с помощью методов найти максимум многомерного массива?
         помощью методов сделать из 2мерного одномерный массив?
         */


        /**
         *  Task 7
         */

        int[][] array7 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        n = 0;
        for(i = 0; i < array7.length; i = i + 1) {
            for (int j = 0; j < array7[i].length; j = j + 1) {
                n = n + 1;
            }
        }

        System.out.println(line + "\n Task " + task);
        System.out.println("количество элементов в массиве = " + n);



    }
}
