import java.util.*;

class MathUtil {
    static void square(int x) {
        System.out.println("Square: " + (x * x));
    }
}

public class StaticExample {
    public static void main(String[] args) {
        MathUtil.square(5);
    }
}
