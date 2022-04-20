
package Java_Beginners_homework;

import java.util.Arrays;

public class BeHW5_2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static int task = 13;

    public static void task(){
        String line="_______________________________________";
        System.out.println(line + ANSI_BLUE + "\n Task " + task++ + ANSI_RESET);
    }
    //13
    public static int getNumber(int a){
        int thousand = 0;
        int hundred = 0;
        int ten = 0;
        int year = 0;
        int happy = 0;
        if (a > 0) {
            thousand = Math.floorDiv(a, 1000);
            hundred = a % 1000 / 100;
            ten = a % 100 / 10;
            year = a % 10;
            return happy = thousand + hundred + ten + year;
        } else {
            return 0;
        }
    }
    public static int HappyNumber(int a) {
        int happy = getNumber(a);
        while (happy > 9) {
            happy = getNumber(happy);
        }
        return happy;

    }
    //14 b
    public static double Mediana (int a, int b, int c){

       int max = Math.max(a, Math.max(b, c));
       int min = Math.min(a, Math.min(b,c));
       int mediana = 0;
       if (a != min && a != max){
           mediana = a;
       } else if (b != min && b != max){
           mediana = b;
       } else if (c != min && c != max){
           mediana = c;
       }

       return mediana;
    }

        public static double MedPrint( int a, int b, int c){
        double aver = Integer.sum(a,Integer.sum(b, c))/3.0;
        double result = aver - Mediana(a,b,c);
        if (result > 2){
            System.out.println("Среднее значение " + aver + " отличается от медианы" + Mediana(a,b,c) + "на" + result);
        } else {
            System.out.println("Среднее значение = " + aver + ", медиана = " + Mediana(a,b,c));
        }
        return result;
    }
    //14b
    public static void Var2(int a, int b, int c){
        int[] array = {a, b, c};
        Arrays.sort(array);
        int mediana = array[1];
        double aver = Integer.sum(a,Integer.sum(b, c))/3.0;
        double result = aver - mediana;
        if (result > 2){
            System.out.println("Среднее значение " + aver + " отличается от медианы " + Mediana(a,b,c) + " на " + result);
        } else {
            System.out.println("Среднее значение = " + aver + ", медиана = " + Mediana(a,b,c));
        }
    }

    public static String PricetoCostom (double a){
        int b = (int) Math.ceil(a);
        String str = b + " руб 00 коп";
        return str;
    }
    //16
    public static double Formula (int a, int b, int c){
      return Math.ceil((Math.sqrt((a * b + c) * Math.pow(a, b))) / Math.PI);
    }
    //17 a
    public static void Numbers(int x, int y){
        if (y > 0){
            for (int i = 1; i < x; i++){
                System.out.println(i);
            }
        } else {
            System.out.println("y < 0");
        }
    }
    //17 b
    public static int score(int x){
        if (x >= 80 && x <= 90){
            x += 5;
        }
        return x;
    }
    //17 c
   /* public static String not(int i, int v){
        String str = "Yes";
        if ((i < 10) || (v > 50)){
           return str;
        } else {
            str = "No";
        }
        return str;
    }*/
    //17 d
    public static boolean integ (int x){
        if (x % 2 == 0 && x > 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean integ2 (int x, int y){
        if (y > 0 && x > 0){
            return true;
        } else {
            return false;
        }
    }
    public static boolean integ3 (int x, int y){

        if ((x >= 0 && y >= 0) && (x < 0 && y < 0)){
            return true;
        } else {
            return false;
        }
    }
    public static void random (){
        double a = Math.random();
        double b = Math.random()*10;
        System.out.println(a);
        System.out.println(b);
        System.out.println((int)Math.pow(a, b));
    }
    public static void random2 (){
        double a = 1 + Math.random()*100;
        System.out.println(a);
    }

    public static boolean leapYear(int Year){
        boolean isLeapYear;
        isLeapYear = Year % 4 == 0;
        return isLeapYear;
    }


    public static void main(String[] args) {
        task();
        System.out.println(HappyNumber(2563));
        task();
        System.out.println("a");
        //System.out.println(Mediana(-12,23,2));
        System.out.println(MedPrint(5, 3, 8));
        System.out.println("b");
        Var2(25,0,5);
        System.out.println(PricetoCostom(10.75));
        System.out.println(Formula(3, 4, 20));
        //17
        Numbers(8, -2);
        System.out.println(score(65));
        random();
        random2();
        System.out.println(leapYear(2011));
    }
}
