package Java_Beginners_homework;

public class BeHW5_1 {

   // 2
   public static String Week(int a){
      String result;
      switch (a){
         case 1: result = "Monday";
         break;
         case 2: result = "Tuesday";
         break;
         case 3: result = "Wednesday";
         break;
         case 4: result = "Thursday";
         break;
         case 5: result = "Friday";
         break;
         case 6: result = "Saturday";
         break;
         case 7: result = "Sunday";
         break;
         default: result = "Please give me number from 1 to 7";
            break;
      }
      return result;
   }

   //3
   public static int LagestVal (int x, int y, int z){

      return Math.max(x, Math.max(y, z));
   }

   //4
   public static int SmallVal (int x, int y, int z){
      return Math.min(x, Math.min(y, z));
   }

   //5
   public static double CatTemp (double a, double b, double c, double d, double e){
      double result = (a + b + c + d + e)/5;
      return result;
   }
   //6
   public static String getPrice (double a){
      String str = String.valueOf(a);
      int idexPoint = str.indexOf(".");
      String result;
      result = (str.substring(0,idexPoint) + " rub " + str.substring(idexPoint + 1) + " kop");
      return result;
}
   //7
   public static String getKg(double a){
      String str = String.valueOf(a);
      int idexPoint = str.indexOf(".");
      String result = (str.substring(0,idexPoint) + " кг " + str.substring(idexPoint + 1) + " гр");
      return result;
   }
   //8
   public static double Multy(double a, double b){
      //Алгоритм возвращает сумму покупки в виде десятичного числа.
      if (a > 0 && b > 0){
         return a * b;
      } else {
         return 0;
      }
   }
   //9
   public static void Ticket(String str1, double a, double b){
      String line = "_______________________________________";
      System.out.println(str1 + "\n" + "Цена за 1 кг\t" + getPrice(a) + "\n" + "Количество товара\t" + getKg(b) +
              "\n" + line + "\n Сумма к оплате\t" + Multy(a, b));
   }
   //10
   public static double Salary(double a, double b){
      return Multy(a, b) * 22;
   }
   //11
   public static void SalaryTicket(String str1, double a, double b){
      String line = "_______________________________________";
      System.out.println(line + "\n" + str1 + "\t" + getPrice(Salary(a, b)) );
   }


   //Tests
   //2
   public static boolean verifyEquals1(String expectedResult, int a){
      String actualResult = Week(a);
      expectedResult = "Friday";
      boolean result = expectedResult.equals(actualResult);
      return result;
   }
   //3
   public static boolean verifyEqualsMax(int x, int y, int z, int expectMax){
      boolean result = LagestVal(x,y,z) == expectMax;
     return result;
   }
   //4
   public static boolean verifyEqualsMin(int x, int y, int z, int expectMin){
      boolean result = SmallVal(x,y,z) == expectMin;
      return result;
   }
   //5
   public static boolean verifyEqualsCat(double a, double b, double c, double d, double e, double expTemp){
      boolean result = CatTemp(a, b, c, d, e) == expTemp;
      return result;
   }
   //6
   public static boolean verifyEqualsGetPrice(double a, String expStr){
      boolean result = getPrice(a).equals(expStr);
      return result;
   }
   //7
   public static boolean verifyEqualsGetKg (double a, String expStr){
      boolean result = getKg(a).equals(expStr);
      return result;
   }
   //8
   public static boolean verifyEqualsPriceKg (double a, double b, double c){
      boolean result = Multy(a, b) == (c);
      return result;
   }

   public static void main(String[] args) {

      System.out.println(verifyEquals1("Friday", 2));
      System.out.println(verifyEqualsMax(5, -14, 0, 5));
      System.out.println(verifyEqualsMin(5, -12, 0, -12));
      System.out.println(CatTemp(36, 37, 35, 38, 39));
      System.out.println(verifyEqualsCat(36, 37, 35, 38, 39, 37.0));
      System.out.println(getPrice(10.75));
      System.out.println(verifyEqualsGetPrice(10.75, "10 rub 75 kop"));
      System.out.println(verifyEqualsGetKg(10.75, "10 кг 75 гр"));
      System.out.println(verifyEqualsPriceKg(5, 5, 25));
      System.out.println("\n");
      Ticket("Яблоки", 50.13,3.4);
      System.out.println("март 22");
      SalaryTicket("Смирнова Мария Ивановна", 250, 8);
      SalaryTicket("Серебряков Иван Петрович", 300, 8);
   }


}
