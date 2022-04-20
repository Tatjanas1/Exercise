package Java_Beginners_homework;

public class BeHW4_3 {

    static int task = 16;
    public static void getTask(){
        String line="_______________________________________";
        System.out.println(line + "\n Task " + task++);
    }
    public static void doTask16(double apple, double student){
        String text1="Если ";
        String text2;
        String text3;
        String text4;
        String text5;

        if (apple % 10 == 1){
            text2 =" яблоко поделить на ";
        } else if (apple % 10 == 2 || apple % 10 == 3 || apple % 10 == 4) {
            text2 =" яблока поделить на ";
        } else {
            text2 =" яблок поделить на ";
        }

        if (student % 10 == 1 || student % 10 == 2 || apple % 10 == 3 || apple % 10 == 4){
            text3 = " ученика, то каждый ученик получит по ";
        }  else {
            text3 = " учеников, то каждый ученик получит по ";
        }

        if ((apple/student) % 10 == 1){
            text4 = " яблоку, и ";
        } else if ((apple/student) % 10 == 2 || (apple/student) % 10 == 3 || (apple/student) % 10 == 4) {
            text4 = " яблокa, и ";
        } else {
            text4 = " яблок, и ";
        }
        if ((apple%student) % 10 == 1){
            text5 =" яблоко останется учителю.";
        } else if ((apple%student) % 10 == 2 || (apple%student) % 10 == 3 || (apple%student) % 10 == 4) {
            text5 =" яблока останется учителю.";
        } else {
            text5 =" яблок останется учителю.";
        }

        String text = text1 + apple + text2 + student + text3 + apple/student + text4 + apple%student + text5;

        System.out.println(text);
    }

    public static void doTask17(double cels){
        String str23A = " градусов по Цельсию  = ";
        String str23B = " градусов по Фаренгейту";

        double CtoF = cels * 9/5 + 32;
        double n23 = 50;
        //There are 0.45359237 kilograms per pound and there are 2.204622622 pounds per kilogram.

        System.out.println(cels + str23A + Math.round(CtoF) + str23B);
    }

    public static void doTask18(int i){
        double i1 = (double) i;
        double i2 = (double) i + 0.999999999;

        System.out.println("_________________________" + "\n| int min | " + i1 + "          |");
        System.out.println("_________________________" + "\n| int max | " + i2 + "  |");
        System.out.println("_________________________" + "\n| i ^ 2   | " + Math.pow(i,2) + "          |");
        System.out.println("_________________________");
    }

    public static int doTask179(int n10){
        if (n10 % 2 == 0) {
            n10 = n10 * 2;
        } else {
            n10 = (int) Math.pow(n10,2);
        }
        return n10;
    }
    public static void doTask19(int n10, int expectedResult){
        if (expectedResult == doTask179(n10)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
        System.out.println("n = " + doTask179(n10));
    }

    public static String Task20(int n11){
        String s11 = null;
        if (n11 >= 18) {
            s11 = "Голосовать можно с 18 лет";
        } else if (n11 >= 16){
            s11 = "Машину можно водить с 16 лет";
        } else if (n11 >= 5){
            s11 = "В школу можно идти с 5 лет";
        }
        return s11;
    }

    public static void doTask20(int n11){
        if (n11 >= 18 && Task20(n11).equals("Голосовать можно с 18 лет")) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else if ((n11 >= 16) &&  Task20(n11).equals("Машину можно водить с 16 лет")){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");;
        } else if ((n11 >= 5) && (Task20(n11).equals("В школу можно идти с 5 лет"))){
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.print("\u001B[31m" + "Fail" + "\u001B[0m");
            System.out.println("\t Введено число меньше допустимого");
        }
    }

    public static void Task21(){

    }



    public static void main(String[] args) {
        getTask();
        doTask16(42,42);
        doTask16(55,5);
        doTask16(1,2);

        getTask();
        doTask17(36.6);

        getTask();
        doTask18(2);
        doTask18(20);

        getTask();

       doTask19(-2,-4);
       doTask19(5, 25);
       doTask19(0, 0);

       getTask();
       doTask20(0);
       doTask20(25);
       doTask20(16);

       getTask();
       Short s = 100;
       String str = s.toString();
       System.out.println("It’s a " + str.length() + "-digit number.");
       //Сделать метод для перевода цифр в буквы

    }
}
