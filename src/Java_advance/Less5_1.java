package Java_advance;

public class Less5_1 {
    public static void main(String[] args) {
        System.out.println("Unary operation");
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a += 5;
        System.out.println(a);
        for (int i = 0; i < a; i++){
            if (i == 3){
                continue; // заканчивает иттерацию
            }
            if (i == 5){
                break; // прерывает весь цикл
            }
            System.out.println(i);
            //дебагинг - Fn + F7, F8

            //methods
            String str = "Hi!";
            System.out.println(str.indexOf('!'));
            //Функция - некоторый поименнованный участок кода, м сущ-ть сам по себе
            // Метода - может вызвать к-то функцию, передать в нее параметры и получить результат. Разница м/у методом и фунцией:
            // Ф-ция м жить сама по себе, а метод это часть к-то класса.
        }
    }
}
