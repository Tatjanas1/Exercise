package Java_advance;

public class HW5_2_Piramids {
    public static void main(String[] args) {
        //Task 1
        for (int j = 9; j >= 0; j--) {
            for (int i = 0; i <= j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //Task 2
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; i <= j; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Task 3
        for (int i = 9; i >= 0; i--) {
            for (int j = 9; i <= j; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0; j--) {
                    System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        //Task 2
        for (int i = 0; i < 9 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j < 9; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
