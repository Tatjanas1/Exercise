package Java_Beginners_homework;

public class BeHW6 {
    static int task = 1;
    static int exs = 0;
    static int exs4 = 0;
    static int exs5 = 0;

    public static void task(){
        String line="_______________________________________";
        System.out.println(line + "\n Task " + ++task);
    }
    public static void exs() {
        String line = " ***";
        System.out.println(line + " Exercise " + ++exs + line);
    }
    public static String print0ToX (int x){
        String result = "";
        for (int i = 0; i <= x; i++){
           result += Integer.toString(i);
        }
        return result;
    }

    public static void main(String[] args) {
        task();
        System.out.println(print0ToX(9));

        //продолжение в отдельном файле с Мавеном и автотестами в ТестНГ

    }
}
