interface Test {
    int X = 90;

    void meth1();

    void meth2();

    void meth3();

    default void meth4() {
        System.out.print("Default meth4");
    }

}

interface Test2 {

    void meth5();
}

class My implements Test {
    public void meth1() {
    }

    public void meth3() {
    }

    public void meth2() {
    }

    // public void meth4() {
    //     System.out.println("hello");

    // }

}

public class Interfaces2 {
    public static void main(String[] args) {
        System.out.println(Test.X);
        My m = new My();

        m.meth4();
    }
}