package Java_advance;

public class HW5_1_2_codewars {
    public static int doubleInteger(int i) {
        return i * 2;
    }

    public static boolean isLove(final int flower1, final int flower2) {
 /*   boolean result = true;
    if (flower1 % 2 != 0 && flower2 % 2 == 0){
        result = true;
    } else if (flower2 % 2 != 0 && flower1 % 2 == 0){
        result = true;
    } else {
        result = false;
    }
    return result;
   */
        return flower1 % 2 != flower2 % 2;
    }

    public static String numberToString(int num) {
        // Return a string of the number here!
        return String.valueOf(num);
        //return Integer.toString(num);
    }

    public static int findSmallestInt(int[] args) {
        int min = args[0];
        for (int i = 0; i < args.length; i ++) {
            if (min > args[i]) {
                min = args[i];
            }
        }
        return  min;
    }

        //вариант в 1 строку - return IntStream.of(args).min().getAsInt();

        //вариант в 2 строки - Arrays.sort(args);
        //        return args[0];

    public static String countingSheep(int num) {
        //Add your code here
        String strResult = "";
        for (int i = 1; i <= num; i++) {
            strResult = strResult + String.valueOf(i) + " sheep...";
        }
        return strResult;
    }
    // Variant 2
    /*class Kata {
        public static String countingSheep(int num) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i <= num; i++) {
                stringBuilder.append(i).append(" sheep...");
            }
            return stringBuilder.toString();
        }
    }*/
    //Variant 3
    /*import java.util.stream.Collectors;
import java.util.stream.IntStream;

    public class Kata {
        public static String countingSheep(int num) {
            return IntStream.rangeClosed(1, num)
                    .mapToObj(i -> i + " sheep...")
                    .collect(Collectors.joining());
        }
    }*/


    public static void main(String[] args) {
        // 1
        System.out.println(doubleInteger(2));
        // 2
        System.out.println(isLove(3,5));
        // 3
        System.out.println(numberToString(45));
        System.out.println(numberToString(45).getClass());
        // 4
        int [] arg = {-9, 5, 4, -4};
        System.out.println(findSmallestInt(arg));
        // 5
        System.out.println(countingSheep(25));

    }
}