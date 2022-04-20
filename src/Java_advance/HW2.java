package Java_advance;

public class HW2 {
    public static void main(String[] args){
        int a= 10;
        int b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a%b);
        System.out.println(a*b);
        System.out.println(1.0*a/b); //умножаем на 1,0 чтобы сделать число double, тк Джава приводит к самому старшему классу. так же можно просто +0,0 (-.% и пр) эффект тотже
        System.out.println("a is odd: " + a%2);
        System.out.println("b is odd: " + b%2);
     // вывести смайлик
        // http://dplatz.de/blog/2019/emojis-for-java-commandline.html
      /*  See below for how it works in Java:

        Go to this index and find emoji to use. E.g. "Grinning Face" has UTF-16 code U+1F600.

        Go to fileformat.info and query for U+1F600.

        Click on the returned result and find the row "C/C++/Java source code"; which should show "\uD83D\uDE00".

         Put System.out.println("\uD83D\uDE00") into your Java application.

        If you run this application in a terminal and the font supports it, you should see the grinning face 😀.
*/
        System.out.println("\uD83D\uDE00");
        System.out.println("\uD83E\uDEE0");

    }
}
