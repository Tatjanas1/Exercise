package Java_advance.HW_7;

public class Employee {
    private double baseSalary;
    private String name;
    private double salary;

    public Employee(double baseSalary, String name) {
        this.baseSalary = baseSalary;
        this.name = name;
    }

    public double getBaseSalary(){
         return baseSalary;
    }
    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        this.salary = baseSalary*1.0;
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
