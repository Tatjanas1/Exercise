package Java_advance.HW_7;

import static Java_advance.HW_7.MonthUtil72.MONTH;

public class Main72 {
    public static void main(String[] args) {
        Employee72 employee1 = new Employee72("Sergey", 30, 'M', 1000);
        Manager72 employee2 = new Manager72("Anna", 28, 'F', 1000, 5);

        Month72[] month72 = {new Month72("January", 31, 21),
                new Month72("February", 28,20),
                new Month72("March", 31,23)};

        System.out.println(employee1.getSalary(MONTH));
        System.out.println(employee2.getSalary(MONTH));

    }
}
