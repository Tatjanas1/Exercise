package Java_advance.HW_7;

public class Manager72 extends Employee72{
    private int subOrdination;

    public Manager72(String name, int age, char gender, double daySalary, int subOrdination) {
        super(name, age, gender, daySalary);
        this.subOrdination = subOrdination;
    }

    public int getSubOrdination() {
        return subOrdination;
    }

    public void setSubOrdination(int subOrdination) {
        this.subOrdination = subOrdination;
    }
    /*getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/
    public double getSalary(Month72[] monthArray){
        double salaryDayManager = getDaySalary() + ((getDaySalary() / 100) * getSubOrdination());
        double salaryManager = 0;
        for (int i = 0; i < monthArray.length; i++){
            salaryManager += salaryDayManager * monthArray[i].getWorkDays();
        }
        return salaryManager;
    }
}
