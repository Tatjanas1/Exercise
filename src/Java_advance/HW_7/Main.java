package Java_advance.HW_7;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker(1000, "Sergey");
        Worker w2 = new Worker(1500, "Anna");
        Worker w3 = new Worker( 2000, "Anton");
        Worker w4 = new Worker(1200, "Tamara");
        Director director1 = new Director(1000, "Igor", 10);
        Manager manager1 = new Manager(2000, "Vitaliy", 30);
        Manager manager2 = new Manager(2500, "Vasya", 40);
        Manager manager3 = new Manager(2200, "Vika", 25);

        Worker[] workers = {w1, w2, w3, w4, director1, manager1};
        Manager[] managers = {director1, manager1, manager2, manager3};

        System.out.println(w1.getSalary());
        System.out.println(director1.getSalary());
        System.out.println(manager1.getSalary());
        System.out.println(EmployeeHelper.findNameByName(workers, "Sergey").getName() + "  " + EmployeeHelper.findNameByName(workers, "Sergey").getSalary());
        System.out.println(EmployeeHelper.findNameBySubName(workers, "An").getName());
        System.out.println(EmployeeHelper.culcBudget(workers));
        System.out.println(EmployeeHelper.findMinSalary(workers).getName());
        System.out.println(EmployeeHelper.findMaxSalary(workers).getName() + "  " + EmployeeHelper.findMaxSalary(workers).getSalary());
        System.out.println(EmployeeHelper.findMaxSubordinat(managers).getName());
        System.out.println(EmployeeHelper.findMinSubordinat(managers).getName());
        System.out.println(manager1.getSalary());
        System.out.println(manager2.getSalary());
        System.out.println(manager3.getSalary());
        System.out.println(EmployeeHelper.findMaxDifSalary(managers).getName() + "   " + (EmployeeHelper.findMaxDifSalary(managers).getSalary() - EmployeeHelper.findMaxDifSalary(managers).getBaseSalary()));
        System.out.println(EmployeeHelper.findMinDifSalary(managers).getName() + "   " + (EmployeeHelper.findMinDifSalary(managers).getSalary() - EmployeeHelper.findMinDifSalary(managers).getBaseSalary()));
        System.out.println(workers[0]);
        System.out.println(w1);
    }
}
