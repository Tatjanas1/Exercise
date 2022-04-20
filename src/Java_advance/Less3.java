package Java_advance;

public class Less3 {
    public static void main (String[] args){
        System.out.println("\uDE09");
        // see asqu symbos
        char c=57567;
        char b='A';
        System.out.println(c);
        // convert to type
        int d;
        d = (int)c;
        System.out.println(d);
        char l = 'a';
        System.out.println((int)l);
        // to find type of value
        int i=5;
        if (i>=1 && i<5) {
            System.out.println("1,2,3,4");
        } else {
            if (i >= 5) {
                System.out.println(">=5");
            } else {
                System.out.println("<1");
            }
        }
    // && and
        // || or
        int a1 =5; // 101 >>001
        int b1=2;
        System.out.println(a1>>b1);

        int a2 =5; // 101 <<10100
        int b2=2;
        System.out.println(a2<<b2);
        int i1=0;
        for (; i1<5; i1=++i1){
            System.out.println(i1);
        }
        System.out.println(i1);
    }
}
