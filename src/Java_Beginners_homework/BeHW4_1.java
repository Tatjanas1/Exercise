package Java_Beginners_homework;

public class BeHW4_1 {

    static int task = 1;
    static int exs = 0;
    static int exs4 = 0;
    static int exs5 = 0;

    public static void task(){
        String line="_______________________________________";
        System.out.println(line + "\n Task " + ++task);
    }
    public static void exs(){
        String line=" ***";
        System.out.println(line + " Exercise " + ++exs + line);
    }
    public static void exs4(){
        String line=" ***";
        System.out.println(line + " Exercise " + ++ exs4 + line);
    }
    public static void exs5(){
        String line=" ***";
        System.out.println(line + " Exercise " + ++ exs5 + line);
    }


    public static void main(String[] args) {
        task();
        System.out.println("Result 2");

        task();
        exs();
        // 1
        if (2 == 2 && 7 == 7){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        // как сделать, чтобы после применения юникода цвета последующий код перестал краситься в зеленый

        //2
        exs();

        if (!(15 < 3)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //3
        exs();
        String st1 ="Сосна";
        String st2 = "Дуб";
        String st3 = "Вишня";
        String st4 = "Клён";
        if ((st1 == st2) || (st3 == st4)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //4
        exs();
        if (!(st1 == st2)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //5
        exs();
        if ((!(15 < 3)) && (10 > 20)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //6
        exs();
        String str1 = "Глаза даны, чтобы видеть";
        String str2 = "Под третьим этажом находится второй этаж";
        if (str1 == str2){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        //7
        exs();

        if (( 6 / 2 == 3 ) || ( 7 * 5 == 20 )){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        task();
        exs4();

        String str3 = "Работающие часы показывают время";


        if (( 60 == 70 ) || ( str3 == str3)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        exs4();

        if ((!(28 > 7)) && (!(300/5 == 60))){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        exs4();

        String str4 = "Телевизор - электрический прибор";
        String str5 = "Стекло - дерево";

        boolean b = !(str5 instanceof String);
        if ((str4 instanceof String) && (b == true)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        exs4();

        if (!(300 < 100)) {
            System.out.println("→ (\"Жажду можно утолить водой\")");
        } else {
            System.out.println("Fail");
        }

        exs4();

        if ((!(28 > 7)) && (!(300/5 == 60))){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        exs4();

        if ((75 < 81) && (88 == 88)){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        task();
        String str6 = "Андрей старше Светы. Наташа старше Светы.";
        String str7 = "На полке стоят учебники, а на столе лежат справочники.";
        String str8 = "БОльшая детей — девочки. Остальные - мальчики.";

        task();
        String str9 = "Водительские права можно получить, только когда исполнится 16 лет.\n";

        task();
        String str10 = "Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно";

        task();
        String str11 = "Если с другом ты, это хорошо, а когда наоборот - плохо”\n";

        task();
        exs5();

        int x = 20;
        if (x > 18){
            System.out.println("\u001B[32m" + "Если тебе больше 18 лет, то ты взрослый." + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Иначе, ты - ребенок." + "\u001B[0m");
        }
        exs5();
        String str9A = "сухая";
        String str9B = "мокрая";
        String str9Fact = "мокрая";

        if (str9Fact.equals(str9A)){
            System.out.println("\u001B[32m" + "Если земля.сухая," + "\u001B[36m" + " значит," + "\u001B[31m" +
                    " нет дождя." + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Если земля мокрая" + "\u001B[31m" + "то идет дождь" + "\u001B[0m");
        }

        exs5();

        if (str9Fact.equals(str9A)){
            System.out.println("\u001B[32m" + "Если земля.сухая," + "\u001B[36m" + " значит," + "\u001B[31m" +
                    " нет дождя." + "\u001B[0m");
        } else if (str9Fact.equals(str9B)){
            System.out.println("\u001B[32m" + "Если земля мокрая" + "\u001B[31m" + "то идет дождь" + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Иначе идет" + "\u001B[34m" + " снег." + "\u001B[0m");
        }

        exs5();
        String str9C = "тучи";
        String str9Fact2 = "тучи";

        if (str9Fact2.equals(str9C)){
            System.out.println("\u001B[32m" + "Если на небе тучи, " + "\u001B[36m" + " идет дождь," + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + " иначе идет " + "\u001B[31m" + "“слепой” дождь." + "\u001B[0m");
        }

        exs5();

        String str9D = "суббота";
        String str9E = "пятница";
        String str9Fact3 = "т";

        if (str9Fact3.equals(str9D)){
            System.out.println("\u001B[32m" + "Если сегодня суббота," + "\u001B[36m" + "   значит," + "\u001B[31m" +
                    "  завтра воскресенье." + "\u001B[0m");
        } else if (str9Fact3.equals(str9E)){
            System.out.println("\u001B[32m" + "Если сегодня пятница, " + "\u001B[31m" + " значит, вчера был четверг."
                    + "\u001B[0m");
        } else {
            System.out.println("\u001B[32m" + "Иначе вчера был не четверг" + "\u001B[34m" +
                    "  , а завтра - не воскресенье" + "\u001B[0m");
        }

        exs5();

        System.out.println("\u001B[36m" + "Если на горе свистнул рак," + "\u001B[32m" + "значит," +
                " прошла вечность," + "\u001B[32m" + "иначе " + "\u001B[31m" + "ждите дальше." + "\u001B[0m");

        exs5();

        System.out.println("\u001B[36m" +" Если тебе 18 или" + "\u001B[32m" + " ты закончил школу, то ты можешь" +
                "\u001B[31m" + "не жить с родителями," + "\u001B[34m" + "иначе живи с родителями." + "\u001B[0m");



    }
}
