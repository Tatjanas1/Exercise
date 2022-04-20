package Java_advance.HW_7;

public class Director extends Manager{
    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }
    public double getSalary(){
        double salary;
        if (getNumberOfSubordinates() > 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * 9);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
