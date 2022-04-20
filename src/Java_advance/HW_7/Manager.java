package Java_advance.HW_7;

public class Manager extends Worker{
    public Manager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    private int numberOfSubordinates;

    public void setNumberOfSubordinates(int numberOfSubordinates){
        this.numberOfSubordinates = numberOfSubordinates;
    }
    public int getNumberOfSubordinates(){
        return numberOfSubordinates;
    }
    public double getSalary(){
        double salary;
        if (numberOfSubordinates > 0){
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * 3);
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
}
