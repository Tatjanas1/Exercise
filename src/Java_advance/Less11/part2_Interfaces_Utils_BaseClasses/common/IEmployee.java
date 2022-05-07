package Java_advance.Less11.part2_Interfaces_Utils_BaseClasses.common;

public interface IEmployee {
    public static final String NAME = "Ivan"; //в Интерфейсах можно создавать поля - они по умолчанию
    // public static final, именно поэтому idea предлагает опустить это. Редко используется, тк интерфейсы служат для
    // связи несвязанных между собой классов, путем нахождения общих (присущих обоим классам) методам.

    public abstract String getName(); //при этом можно интер фасе extends IName, тогда String getName(); будет
    // унаследована и можно ее опустить
    double getSalary();

    // методы служат для связи несвязанных между собой классов, они записываются, как правило, пустые,
    // чтобы в соответствующем классе переопределить их

    default void print(String str){
        System.out.println("str");
    }
    public static void println(String str) {
        System.out.println("str");
    }
    //в Интерфейсах можно создавать методы, но считается дурной практикой, редко встречается double getSalary(Month[] monthArray);
   // default метод вызывается от объекта. public static от класса-типа (см код в майн)

}
