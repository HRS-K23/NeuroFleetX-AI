import java.util.*;

class Box {
    int width, height;

    Box() {
        width = height = 0;
    }

    Box(int w, int h) {
        width = w;
        height = h;
    }

    void display() {
        System.out.println("Width: " + width + ", Height: " + height);
    }
}

public class ConstructorOverload {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box(10, 20);
        b1.display();
        b2.display();
    }
}
