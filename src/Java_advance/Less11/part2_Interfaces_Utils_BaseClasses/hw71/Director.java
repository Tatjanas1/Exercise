package Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw71;

public final class Director extends BaseManager {

    private static final int INDEX = 9;

    public Director(double baseSalary, String name, int numberOfSubordinates) {
        super(baseSalary, name, numberOfSubordinates);
    }

    @Override
    protected int getIndex() {
        return INDEX;
    }
}
