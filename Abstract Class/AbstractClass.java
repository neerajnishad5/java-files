abstract class Super {
    void meth1() {
        System.out.println("Super meth1");
    }

    void meth2() {
        System.out.println("Super meth2");
    }

    abstract void meth3();
}

class Sub extends Super {
    void meth3() {
        System.out.println("Sub meth3");
    }
}

public class AbstractClass {

    public static void main(String[] args) {
        Super s = new Sub();

        s.meth3();
    }
}
