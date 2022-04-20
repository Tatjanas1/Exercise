package Java_Beginners_homework;

public class BeHW3 {
    public static void main(String[] args) {
        /**
        *  Task 2
         */

        int task = 2;
        String line="_______________________________________";
        byte a = (byte) (Math.pow(2,7) -1);
        byte b = (byte) Math.pow(-2,7);

        System.out.println(line + "\n Task " + task);
        System.out.println("byte    " + a + "\t " + b);

        /**
        *  Task 3
         */

        short s = (short) (Math.pow(2,15) - 1);
        short s1 = Short.MAX_VALUE;
        short t = (short) (s-60000);

        System.out.println(line + "\n Task " + ++task);
        System.out.println("short   " + s1 + "\t " + t);

        /**
         *  Task 4
         */
        int i = (int) (Math.pow(2,31)-1);
        int i1 = (int) Math.pow(-2,31);

        System.out.println(line + "\n Task " + ++task);
        System.out.println("_________________________" + "\n| int min | " + i1 + " |");
        System.out.println("_________________________" + "\n| int max | " + i + "  |");
        System.out.println("_________________________");

        /**
         *  Task 5
         */
        System.out.println(line + "\n Task " + ++task);

        long phoneNumber = (long) (Math.pow(2,63)-1);
        System.out.println("Max Long = " + phoneNumber);

        phoneNumber = 9223372036854775807L;
        System.out.println(phoneNumber);

        /**
         *  Task 6
         */

        float f = 100.101101f;
        double d = 1000.101101;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(line + "\n| float f = 100.101101  | " + f + "  |");
        System.out.println(line + "\n| double d = 100.101101 | " + d + " |");
        System.out.println(line + "\n");


        /**
         *  Task 7
         */

        double dd = (10.09999 + 20.099999);
        float ff = 10.09999f + 20.099999f;
        float maxFloat= (float) (( 2 - Math.pow(2,-23) ) * Math.pow(2,127));
        String line1 = "______________________";

        System.out.println(line + line1 + "\n Task " + ++task);
        System.out.println(line + line1 + "\n| double dd = (10.09999 + 20.099999)  | " + dd + "  |");
        System.out.println(line + line1 + "\n| float ff = (10.09999 + 20.099999)  | " + ff + "             |");
        System.out.println(line + line1);


        /**
         *  Task 8
         */
        double result = 10/3.0;

        System.out.println(line + "\n Task " + ++task);
        System.out.println("result = " + result);

        /**
         *  Task 9
         */
        double sum = f + d;
        double product = f * d;
        double quotient = f / d;
        double remainder = f % d;

        System.out.println(line + "\n Task " + ++task);
        System.out.println("sum = " + Double.sum(f,d));
        System.out.println("sum = f + d = " + sum + "\n" + "product = f * d = " + product + "\n" + "quotient = f / d = "
                + quotient + "\nremainder = f % d = " + remainder);

        /**
         *  Task 10
         */

        System.out.println(line + "\n Task " + ++task);
        System.out.println(".  . .... .   .   ...");
        System.out.println(".  . .    .   .   . .");
        System.out.println(".... .... .   .   . .");
        System.out.println(".  . .    .   .   . .");
        System.out.println(".  . .... ... ... ...");

        /**
         *  Task 11
         */
        byte t1 = 0;
        short t2 = 150;
        byte t3 = -120;
        float t4 = - 505.505f;
        int t5 = 100100;
        long t6 = 100010001000L;
        double t7 = 2.66666666666666;
        double t8 = - 1000000.001;
        short t9 = 1010;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
        System.out.println(t5);
        System.out.println(t6);
        System.out.println(t7);
        System.out.println(t8);
        System.out.println(t9);

        /**
         *  Task 12
         */

        System.out.println(line + "\n Task " + ++task);
        System.out.println("|  Type      |   Size in bits        |          man       |            mix        |");
        System.out.println("|  " + Byte.class + "      |  " + Byte.SIZE + "                    |  " + Byte.MAX_VALUE  + "               |  " + Byte.MIN_VALUE + "                 |  ");
        System.out.println("|  short     |  " + Short.SIZE + "   |  " + Short.MAX_VALUE  + "  |  " + Short.MIN_VALUE + "  |  ");
        System.out.println("|  int       |  " + Integer.SIZE + " |  " + Integer.MAX_VALUE  + "|  " + Integer.MIN_VALUE + "|  ");
        System.out.println("|  long      |  " + Long.SIZE + "    |  " + Long.MAX_VALUE  + "   |  " + Long.MIN_VALUE + "   |  ");
        System.out.println("|  float     |  " + Float.SIZE + "   |  " + Float.MAX_VALUE  + "  |  " + Float.MIN_VALUE + "  |  ");
        System.out.println("|  double    |  " + Double.SIZE + "  |  " + Float.MAX_VALUE  + "  |  " + Float.MIN_VALUE + "  |  ");

        /**
         *  Task 13
         */
        Integer num1 = 127;
        Integer num2 = 127;
        Integer num3 = 128;

        System.out.println(line + "\n Task " + ++task);
        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));
        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num3));

        /**
         *  Task 14
        */

        int number1 = 2;
        int number2 = 2;
        int number3 = 5;
        int number4 = -1;

        System.out.println(line + "\n Task " + ++task);
        System.out.println("Если number1 = number2, то результат сравнения методом compare =  " + Integer.compare(number2,number1));
        System.out.println("Если number1 < number2, то результат сравнения методом compare = " + Integer.compare(number1,number3));
        System.out.println("Если number1 > number2, то результат сравнения методом compare =  " + Integer.compare(number1,number4));


        /**
         *  Task 15
        */

        Float f15 = 234.9999f;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(f15.intValue());
        System.out.println(Math.round(f15));

        /**
         *  Task 16
        */

        Double SUM = Double.sum(sum,product);

        System.out.println(line + "\n Task " + ++task);
        System.out.println(SUM);
        System.out.println(Double.sum(sum,product));

        /**
         *  Task 17
         */

        Float f17 = 1.0f;
        Integer first = f17.intValue();
        Integer second = f15.intValue();
        Integer Sumfloat = Integer.sum(first,second);

        System.out.println(line + "\n Task " + ++task);
        System.out.println(Sumfloat);
        System.out.println(Integer.sum(f15.intValue(), f17.intValue()));

        /**
         *  Task 18
         */

         Short short1 = 12000;
         Short short2 = 12300;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(short1 + " - " + short1 + " = " + Short.compare(short1,short2));
        System.out.println(short1 + " - " + short1 + " = " + Short.compareUnsigned(short1,short2));
        short1 = 12500;
        short2 = 12300;
        System.out.println(short1 + " - " + short1 + " = " + Short.compare(short1,short2));

        /**
         *  Task 19

         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */
        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(Double.sum(doub1, - doub2));
        System.out.println(doub1 - doub2);

        // convert into Double
        double str3 = Double.parseDouble(str1);
        // print String as Double
        System.out.println(str3);
        //using convertion in print
        System.out.println(Double.parseDouble(str2));
        //check if both are double
        System.out.println(str3+doub1);
        System.out.println(123.56+123.55);
        System.out.println(Double.sum(Double.parseDouble(str1), -Double.parseDouble(str2)));

        /**
         *  Task 20
         */

        double cattemp = 41.0;
        cattemp=cattemp+37.5;
        cattemp=cattemp/2;

        double catmax = 41.0;
        double catmin = 37.5;
        double sumcat = catmax + catmin;
        double Midlresult = sumcat/2;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(Midlresult);
        System.out.println(Math.round(sumcat/2));
        System.out.println(Math.round(Double.sum(catmax,catmin)/2));
        System.out.println("Variant2" + "Temp Cat = " + Math.round(cattemp));

        /**
         *  Task 21
        */
        Number n = Long.MAX_VALUE;

        System.out.println(line + "\n Task " + ++task);
        System.out.println("Переменная n может принимать значения:");
        System.out.println("n = " + n);

        n = 10;
        System.out.println("n = " + n);

        n = 10.999999999;
        System.out.println("n = " + n);
        System.out.println("Это возможно, потому что: Number() ist a Constructor for subclasses to call.");


        /**
         *  Task 22
         */

        Integer numberInteger = 100;

        System.out.println(line + "\n Task " + ++task);
        System.out.println(numberInteger.getClass());
        System.out.println(numberInteger.toString().getClass());
        System.out.println("Это число " + (numberInteger instanceof Integer));
        System.out.println("Это строка " + (numberInteger.toString() instanceof String));
        System.out.println(numberInteger + numberInteger);
        System.out.println(numberInteger.toString() + numberInteger);


        /**
         *  Task 23
         */

        String str23A = " градусов по Цельсию  = ";
        String str23B = " градусов по Фаренгейту";
        String str23C = " kilogram = ";
        String str23D = " lbs, ";
        String str23E = " lb = ";
        String str23F = " kg";
        double Cels = 36.6;
        double CtoF = Cels * 9/5 + 32;
        double n23 = 50;
        //There are 0.45359237 kilograms per pound and there are 2.204622622 pounds per kilogram.
        double kiloTolbs = n23 * 2.204622622;
        double lbsTokilo = n23 * 0.45359237;
        String result23 = String.format("%.2f",lbsTokilo);

        System.out.println(line + "\n Task " + ++task);
        System.out.println(Cels + str23A + Math.round(CtoF) +str23B);
        System.out.println(n23 + str23C + kiloTolbs + str23D + n23 + str23E + result23 + str23F);

    }
}
