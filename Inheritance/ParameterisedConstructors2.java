class Rectangle {
    int l;
    int b;

    Rectangle() {
        l = b = 1;
    }

    Rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }
}

class Cuboid extends Rectangle {
    int h;

    Cuboid() {
        h = 1;
    }

    Cuboid(int h) {
        this.h = h;
    }

    Cuboid(int l, int b, int h) {
        super(l, b);
        this.h = h;
    }

    int volume() {

        return l * h * b;
    }
}

public class ParameterisedConstructors2 {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(4, 5, 10);
        System.out.println("Volume: " + c.volume());

    }
}
