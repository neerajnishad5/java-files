class Test {
    static int x = 10;
    int y = 90;

    void show() {
        System.out.println("Static value: " + x + " " + "Non-static value: " + y);
    }

    static void disp() {
        System.out.println(x + " " + y); // can't access non-static varible inside static method 
    }
}

public class StaticMembers {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.show();

        t1.x = 800; // altering static value
        t1.y = 500; // altering non-static value wont affect coming objects

        t2.show();
        t1.show();
    }
}
