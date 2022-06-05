class Rectangle {
    int l;
    int b;
    int x = 199;

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
    int x = 10;

    Cuboid(int h) {
        this.h = h;
    }

    Cuboid(int l, int h, int b) {
        super(l, b);
        this.h = h;
    }

    void disp() {
        System.out.println(super.x);
        System.out.println(x);
        ;
    }
}

public class ThisAndSuper {
    public static void main(String[] args) {
        Cuboid c = new Cuboid(5,5,5);
        c.disp();
    }
}
