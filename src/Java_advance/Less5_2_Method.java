package Java_advance;

public class Less5_2_Method {
    public static void main(String[] args) {
        Less5_Test t = new Less5_Test();
        int a = 10;
        int b = 5;
        int c = 1;
        System.out.println(t.sum(a, b));
        int result = t.sum(a, b, c);
        System.out.println(result);
    }
}
