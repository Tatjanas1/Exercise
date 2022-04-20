package Java_Beginners_homework;

import java.util.Arrays;

public class BeHW7 {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0, j = 0; i < array.length; i++, j+=2){
            array[i] = j;
        }
        System.out.println(Arrays.toString(array));
    }
}
