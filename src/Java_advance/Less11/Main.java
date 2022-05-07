package Java_advance.Less11;

import Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.common.IEmployee;
import Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw71.Worker;
import Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw72.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker(1000, "Sergey");
        Employee employee = new Employee("Anna", 30, 'F', 10000);

        IEmployee[] employeeArray = {worker, employee};

        for (int i = 0; i < employeeArray.length; i++){
            System.out.println(employeeArray[i].getName());
            System.out.println(" - ");
            System.out.println(employeeArray[i].getSalary());
        }

        IEmployee.println("public static вызывается от класса-типа");
        worker.print("default метод вызывается от объекта");
        employee.print("default метод вызывается от объекта");
    }
}
