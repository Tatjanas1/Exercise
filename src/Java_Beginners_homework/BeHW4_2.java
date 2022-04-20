package Java_Beginners_homework;

public class BeHW4_2 {
    static int task = 10;
    public static void task(){
        String line="_______________________________________";
        System.out.println(line + "\n Task " + task++);
    }

    static double mod = 0;
    static double division = 0;
    public static void mod(int a, int b){
        mod = (double) a % b;
        division = (double) a % b;
       System.out.println("Результат деления чисел = " + division + ", а остаток от деления  = " + mod);
       }
    // как вывести название переменной k, l и пр в тексте sout?

    public static void Task15(int apple, int student){
        String text1="Если ";
        String text2=" яблок поделить на ";
        String text3 = " учеников, то каждый ученик получит по ";
        String text4 = " яблок(a), и ";
        String text5=" яблок(а) останется учителю.";
        String text = text1 + apple + text2 + student + text3 + apple/student + text4 + apple%student + text5;

        System.out.println(text);
    }


    public static void main(String[] args) {
        task();

        int n10 = 4;
        int expectedResult = 8;

        if (n10 % 2== 0) {
            n10 = n10 * 2;
        } else {
            n10 = (int) Math.pow(n10,2);
        }
        System.out.println("n = " + n10);

//Test
        if (expectedResult == n10) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        task();

        int n11 = 5;

        if (n11 >= 18) {
            System.out.println("Голосовать можно с 18 лет");
        } else if (n11 >= 16){
            System.out.println("Машину можно водить с 16 лет");
        } else if (n11 >= 5){
            System.out.println("В школу можно идти с 5 лет");
        }

        task();
        int n12 = 0;

        if (n12 == 5) {
            System.out.println("выдать похвальную грамоту и перевести в следующий класс");
        } else if (n12 == 4){
            System.out.println("перевести в следующий класс");
        } else if (n12 == 3){
            System.out.println("дать задание на лето и перевести в следующий класс");
        } else if (n12 == 2){
            System.out.println("вызвать родителей и оставить в текущем классе на второй год");
        } else {
            System.out.println("Проверьте правильность ввода оценки");
        }

        task();

        int n13 = 4;
        int m13 = -15;
        int result = 0;
        expectedResult = 0;

        if(n13 %3 ==0 && m13 % 3 == 0){
            result = n13 + m13;
            if (n13 < 0 || m13 < 0){
                result = result * -1;
            }
        } else if (n13 % 5 ==0 && m13 % 5 == 0){
            result = n13 - m13;
            if (n13 < 0 || m13 < 0){
                result = result * -1;
            }
        } else if (n13 % 2 == 0 && m13 % 2 == 0) {
            result = n13 * m13;
            if (n13 < 0 || m13 < 0){
                result = result * -1;
            }
        } else{
            System.out.println("ошибку о невозможности произвести действия");
        }


        System.out.println(result);

        //Test
        if (expectedResult == result) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        task();
        int k = 100;
        int l = 5;
        int m = 6;

        mod(k, l);
        mod(k, m);
        mod(l, m);
        mod(m, k);

        task();
        Task15(100,20);

        }
}
