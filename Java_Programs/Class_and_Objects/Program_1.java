import java.util.*;

class Student {
    int id;
    String name;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Harsh";
        System.out.println(s1.id + " " + s1.name);
    }
}
