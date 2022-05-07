package Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw72;

import Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.common.IEmployee;

import static Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw72.MonthUtils.MONTH;

public class Employee implements IEmployee {

    private String name;
    private int age;
    private char gender;
    private double daySalary;

    public Employee (String name, int age, char gender, double daySalary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.daySalary = daySalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getSalary() {
        return getSalary(MONTH); //подперла костылем... implement MONTH...
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    //вот тут косяк. getSalary(Month[] monthArray) != getSalary() это 2 разных метода и по сути второй не работает теперь...
    //Exception in thread "main" java.lang.StackOverflowError
    //at Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.hw72.Employee.getSalary(Employee.java:25)
    public double getSalary(Month[] monthArray){
        double salary = 0;
        for (int i = 0; i < monthArray.length; i++){
            salary += getDaySalary() * monthArray[i].getWorkDays();
        }
        return salary;
    }
}
