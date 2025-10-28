import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        int num = 100;
        double d = num;  // widening
        System.out.println("Widening: " + d);

        double x = 12.34;
        int y = (int) x; // narrowing
        System.out.println("Narrowing: " + y);
    }
}
