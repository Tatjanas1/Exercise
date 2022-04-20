package Java_advance.HW_7;

public class EmployeeHelper {

    /*поиск сотрудника в массиве по его имени*/
    public static Worker findNameByName(Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(name)) {
                return workers[i];
                // как вывести на печать объект массива workers[i] и  как вывести на печать массив целиком?
                //System.out.println(workers[i].toString());
            }
        }
        return null;
    }

    /* поиск сотрудника в массиве по вхождению указанной строки в его имени */
    public static Worker findNameBySubName(Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }
        }
        return null;
    }

    /* подсчет зарплатного бюджета для всех сотрудников в массиве */
    public static double culcBudget(Worker[] workers) {
        double budget = 0;
        for (int i = 0; i < workers.length; i++) {
            budget += workers[i].getSalary();
        }
        return budget;
    }

    /*поиск наименьшей зарплаты в массиве*/
    public static Worker findMinSalary(Worker[] workers) {
        double minSalary = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (minSalary > workers[i].getSalary()) {
                minSalary = workers[i].getSalary();
            }
        }
        for (int i = 0; i < workers.length; i++) {
            if (minSalary == workers[i].getSalary()) {
                return workers[i];
            }
        }
        return null;
    }

    /*поиск наибольшей зарплаты в массиве*/
    public static Worker findMaxSalary(Worker[] workers) {
        double maxSalary = workers[0].getSalary();
        for (int i = 0; i < workers.length; i++) {
            if (maxSalary < workers[i].getSalary()) {
                maxSalary = workers[i].getSalary();
            }
        }
        for (int i = 0; i < workers.length; i++) {
            if (maxSalary == workers[i].getSalary()) {
                return workers[i];
            }
        }
        return null;
    }

    /*поиск наибольшего количества подчиненных в массиве менеджеров*/
    public static Manager findMaxSubordinat(Manager[] managers) {
        int maxSubOrditat = 0;
        for (int i = 0; i < managers.length; i++) {
            if (maxSubOrditat < managers[i].getNumberOfSubordinates()) {
                maxSubOrditat = managers[i].getNumberOfSubordinates();
            }
        }
        for (int i = 0; i < managers.length; i++) {
            if (maxSubOrditat == managers[i].getNumberOfSubordinates()) {
                return managers[i];
            }
        }
        return null;
    }

    /*поиск наименьшего количества подчиненных в массиве менеджеров*/
    public static Manager findMinSubordinat(Manager[] managers) {
        int minSubOrditat = managers[0].getNumberOfSubordinates();
        for (int i = 0; i < managers.length; i++) {
            if (minSubOrditat > managers[i].getNumberOfSubordinates()) {
                minSubOrditat = managers[i].getNumberOfSubordinates();
            }
        }
        for (int i = 0; i < managers.length; i++) {
            if (minSubOrditat == managers[i].getNumberOfSubordinates()) {
                return managers[i];
            }
        }
        return null;
    }

    /* поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров */
    public static Manager findMaxDifSalary(Manager[] managers) {
        double MaxDifSalary = managers[0].getSalary() - managers[0].getBaseSalary();
        for (int i = 0; i < managers.length; i++) {
            if (MaxDifSalary < (managers[i].getSalary() - managers[i].getBaseSalary())) {
                MaxDifSalary = (managers[i].getSalary() - managers[i].getBaseSalary());
            }
        }
        for (int i = 0; i < managers.length; i++) {
            if (MaxDifSalary == (managers[i].getSalary() - managers[i].getBaseSalary())) {
                return managers[i];
            }
        }
        return null;
    }

    /* поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров */
    public static Manager findMinDifSalary(Manager[] managers){
        double MinDifSalary = managers[0].getSalary()-managers[0].getBaseSalary();
        for (int i = 0; i < managers.length; i++){
            if (MinDifSalary > (managers[i].getSalary()-managers[i].getBaseSalary())){
                MinDifSalary = (managers[i].getSalary()-managers[i].getBaseSalary());
            }
        }
        for (int i = 0; i < managers.length; i++){
            if (MinDifSalary == (managers[i].getSalary()-managers[i].getBaseSalary())){
                return managers[i];
            }
        }
        return null;
    }
}
