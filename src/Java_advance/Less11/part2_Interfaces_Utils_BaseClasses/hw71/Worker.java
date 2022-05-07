package Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw71;

public class Worker extends Employee{
    public Worker (double baseSalary, String name){
        super(baseSalary, name);
    }
    public double getSalary(){
        return getBaseSalary();
    }
}
