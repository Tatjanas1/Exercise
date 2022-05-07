package Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw71;

public abstract class BaseManager extends Worker {

    private int numberOfSubordinates;

    public BaseManager(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public double getSalary() {
        double salary;
        if (numberOfSubordinates > 0) {
            salary = getBaseSalary() * (getNumberOfSubordinates() / 10.0 * getIndex());
        } else {
            salary = getBaseSalary();
        }
        return salary;
    }
    protected abstract int getIndex();
}
