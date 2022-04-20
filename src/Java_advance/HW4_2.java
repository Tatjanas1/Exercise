package Java_advance;

import java.util.Arrays;
import java.util.Locale;

public class HW4_2 {
    public static void main(String[] args) {
        /**
         *  Task 1
         */

        int task = 1;
        String line = "_______________________________________";
        System.out.println(line + "\n Task " + task++);
        System.out.println("Задание: вывести все буквы “о” из этой строки");

        int n = 0;
        String s1;
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
        System.out.println();


        /**
         *  Task 2
         */

        System.out.println(line + "\n Task " + task++);

        s = "Перевыборы выбранного президента";
        n = 0;
        for (int i = 0; i < s.length(); i = i + 1) {
            if (s.charAt(i) == 'е') {
                n = n + 1;
            }
        }
        System.out.println("количество букв “е” в строке = " + n);

        /**
         *  Task 3 КОСТЫЛИ
         */

        System.out.println(line + "\n Task " + task++);

        String str = "Посмотрите как Рите нравится ритм";
        int index_Rit = str.indexOf("Рит"); // Нахождение слова в строке
        int index_rit = str.indexOf("рит"); // Нахождение слова в строке
        int last_rit = str.lastIndexOf("рит");
        // int index_r = str.indexOf("р");

        if (index_Rit == -1) {
            System.out.println("Подстрока \"Рит\" не найден.");
        } else {
            System.out.println("Подстрока \"Рит\" найден в индексе " + index_Rit);
        }

        if (index_rit == -1) {
            System.out.println("Подстрока \"pит\" не найдено.");
        } else {
            System.out.println("Подстрока \"pит\" найдено в индексе " + index_rit);
        }

        if (last_rit == -1) {
            System.out.println("Подстрока \"pит\" не найдено.");
        } else {
            System.out.println("Подстрока \"pит\" найдено в индексе " + last_rit);
        }

        /**
         *  Task 3 Вариант 2 ПРАВИЛЬНЫЙ
         */
        System.out.println(line + "\n Task " + task++ + " Варианта 2");

        String str2 = "Посмотрите как Рите нравится ритм";
        str2 = str2.toLowerCase(Locale.ROOT);

        int indexOf2 = str2.indexOf("рит");
        while (indexOf2 != -1){
            System.out.println(indexOf2);
            indexOf2 = str2.indexOf("рит", indexOf2 + 1);
        }

        /**
         *  Task 3 Вариант 2 МОЖНО, засоряет память созданием подстрок
         */
        System.out.println(line + "\n Task " + task++ + " Варианта 3");
        String subPart = "рит";
        int subcount = subPart.length();
        for (int i = 1; i < str2.length() - subcount; i++){
            String subStr = s.substring(i, i + subcount);
            if(subStr.equals(subPart)){
                System.out.println(i);
            }
        }


        /**
         *  Task 4
         */

        System.out.println(line + "\n Task " + task++);

        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        n = 0;
        int m = 0;

        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
                m = m + 1;
                for (int y = 0; y < array[i][j].length(); y = y + 1) {
                    if (array[i][j].charAt(y) == 'е') {
                        n = n + 1;
                        break;
                    }
                }
            }
        }

        System.out.println("количество строк в массиве, которые содержат буквы “е” = " + n);
        System.out.println("количество строк в массиве, которые НЕ содержат буквы “е” = " + (m - n));

        /**
         *  Task 4 Варианта 2
         */

        System.out.println(line + "\n Task " + task++ + " Варианта 2");
        n = 0;
        for (int i = 0; i < array.length; i = i + 1) {
            for (int j = 0; j < array[i].length; j = j + 1) {
               if (!array[i][j].contains("е")) {
                        n = n + 1;
                }
            }
        }
        System.out.println("количество строк в массиве, которые НЕ содержат буквы “е” = " + n);

    }
}