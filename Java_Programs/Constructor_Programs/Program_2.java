import java.util.*;

class Employee {
    String name;
    int age;

    Employee(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 25);
        e1.display();
    }
}
