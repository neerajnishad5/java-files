interface Test {
    void meth();

    void meth2();
}

class Test2 implements Test {
    public void meth() {
        System.out.println("Test2 meth");
    }

    public void meth2() {
        System.out.println("Test2 meth2");
    }

    public void meth3() {
        System.out.println("Test2 meth3");
    }
}

public class Interfaces {
    public static void main(String args[]) {
        Test t = new Test2();
        t.meth();
        t.meth2();

    }

}
