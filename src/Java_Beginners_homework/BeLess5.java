package Java_Beginners_homework;

public class BeLess5 {
    public static int reternMinofThree (int a, int b, int c){
       int min;
        if (a < b){
            min = a;
        } else {
            min = b;
        }
        if (min > c){
            min = c;
        }
        return min;
    }

    public static double reternAverofThree (int a, int b, int c){
        double average = ((double) a + b + c) / 3.0;
        return average;
    }

    public static double returnDifBetwAverAndMin( int a, int b, int c){
        int min = reternMinofThree(a,b,c);
        double aver = reternAverofThree(a,b,c);
        double difference = min - aver;
        if (difference < 0){
            difference = (-1) * difference;
        }
        return difference;
    }

    public static String printOut (int a, int b, int c){
        String st1;
        if (returnDifBetwAverAndMin(a,b,c) > 3.51){
            st1 = "Большой разброс чисел";
        } else {
            st1 = "Большой разброс чисел";
        }
        return st1;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;
        System.out.println(reternMinofThree(a, b, c));
        System.out.println(reternAverofThree(a, b, c));
        System.out.println(returnDifBetwAverAndMin(a,b,c));
        System.out.println(printOut(a,b,c));
    }
}
