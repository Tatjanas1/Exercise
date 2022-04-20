package Java_Beginners_homework;

public class BeHW2 {

    public static void main(String[] args){
        String line="________________________________________";
        int m=3;
        int k=1;
        int l=2;
        int Task=17;

        System.out.println("Task" + Task);
        System.out.println(k + "\n" + l + "\n" + m);
        System.out.println(k + ", " + l + ", " + m);
        System.out.println("int k=" + k + ", " +"int l=" + l + ", " + "int m=" + m);
        System.out.println("Sum of k and l = " + k+l);
        System.out.println("k * m = " + k*m);
        System.out.println("Разность переменных l и m = " + (l-m));
        System.out.println("Результат деления k на l = " + k/l + ", а остаток от деления  = " +k%l);
        System.out.println("Результат деления k на m = " + k/m + ", а остаток от деления  = " + k%m);
        System.out.println("Результат деления l на m = " + l/m +", а остаток от деления  = " + l%m);
        System.out.println("Результат деления m на k = " + m/k +", а остаток от деления  = " + m%k);


      /*  Создать переменные apple и  student и присвоить им значения 40 и 6 соотетственно. Распечатать выражение:
Если … яблок поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
*/
        System.out.println(line);
        System.out.println("Task "+ ++Task);

        int apple=40;
        int student=6;
        String text1="Если ";
        String text2=" яблок поделить на ";
        String text3 = " учеников, то каждый ученик получит по ";
        String text4 = " яблок(a), и ";
        String text5=" яблок(а) останется учителю.";
        String text = text1 + apple + text2 + student + text3 + apple/student + text4 + apple%student + text5;


        System.out.println(text);

        apple=100;
        student=21;
        text = text1 + apple + text2 + student + text3 + apple/student + text4 + apple%student + text5;
        System.out.println(text);

        System.out.println();
        System.out.println("Task "+ ++Task);
/*
        Распечатать вычисления и итоговый результат:
        Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …


        Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
*/
        System.out.println();
        System.out.println("Task "+ ++Task);
        k=1;
        l=2;
        m=3;
        int sumklm=k+l+m;

        System.out.println("sumklm =" + sumklm);

        int sumklm1=sumklm-1;

        System.out.println("sumklm-- = " + sumklm1);

        int m1=1+m;

        System.out.println("Сумма чисел k, l, m++ = " + (k+m1+l));

                System.out.println("sumKLM-- = " + sumklm1);
                System.out.println("m= "+ m);
                System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (k+l+m1+sumklm1) +
                        ", а разность m++ и  sumLKM = " + (m1-sumklm));

         //Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.

        int int1=48;
        int int2=8;

        System.out.println("int1 is odd = " + int1%2 );
        System.out.println("int2 is odd = " + int2%2);
        System.out.println("47 is odd = " + 47%2);
        System.out.println("49 is odd = " + 49%2);


/*
        Для всех заданий:
        x = 2,   y = 3,  a = k, b = l, c = m, d = y - x
        a. Вывести на печать математическое выражение из заданий 21, 22 и 23
        b. Посчитать значения из задания a и вывести результат на печать в виде таблицы.
                result21, result22 и result23 - результаты вычислений в каждом выражении
        (считать с помощью программы, а не вручную!)
        task              result
        21                result21
        22                result22
        23                result23
*/
        System.out.println("\n" );
        System.out.println("Task 21-23");
double x=2;
double y=3;
        double a=k+0.0;
        double b=l+0.0;
        double c=m+0.0;
        double d=y-x+0.0;
double result22A = ((3+4*x)/5);
double result22B =((10*(y-5)*(a+b+c))/x);
double result22C= (9*((4/x)+((9+x)/y)));
double result22 = result22A-result22B+result22C;
double result23A = ((5*x) + (7*y))/ ((8*x)+(10*y));
double result23B = ((3*x)-y)/(x+y);
double result23C = c/d;
double result23D = (a+b)/(c+d);
double result23E = a*b;
double result23 = (result23A/result23B)/(a+b+result22C+result23D+result23E);
// http://proglang.su/java/numbers-pow
int Result21 = (int) Math.pow((x+3), 2);
String tableLeft="|    ";
String tableRight="  |";
String line1="_______________________________________";
int Task1=21;
        System.out.println(line1 +"\n"+tableLeft+" Task "+ tableRight + " Result                " + tableRight);
        System.out.println(line1 + "\n"+tableLeft+"Task "+ Task1+tableRight + Result21 + "                    " + tableRight);
        System.out.println(line1 + "\n"+tableLeft+"Task "+ ++Task1 + tableRight + result22 + "    " + tableRight);
        System.out.println(line1 + "\n"+tableLeft+"Task "+ ++Task1 + tableRight + result23 + "  " + tableRight);
        System.out.println(line1);
    }
}
