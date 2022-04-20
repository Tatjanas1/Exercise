package Java_advance;

public class HW3_2 {
      public static void main(String[] args){

       // Задача №1
        int i=0;
        for(i=0;i<=15;i++){
        System.out.println(i);
        }

       // Задача №2
          System.out.println("\n \n \n \n Exercise 2");

            int b=1;
            int a=5;

          for (Math.pow(a, b); Math.pow(a, b)<10000; b++) {
              System.out.println(Math.pow(a, b) + "\t" + b);
          }
              System.out.println("Variant 2");
            for (a=5; a < 10000; a = 5 * a) {
                  System.out.println(a);
              }



       //Задача №3


         System.out.println("\n \n \n \n Exercise 3");

          for (i = 40;i <= 60;i = i + 1) {
              if ((i % 4) == 0) {
                  System.out.println(i);
              }
          }


          System.out.println("\n Variant 2");

        for (i = 40;i <= 60;i = i + 4) {
            System.out.println(i);
        }
    }
}
