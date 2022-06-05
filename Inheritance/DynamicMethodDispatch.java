class Super {
    void meth1() {
        System.out.println("Super meth1");
    }

    void meth2() {
        System.out.println("super meth2");
    }
}

class Sub extends Super {
    @Override
    void meth2() {
        System.out.println("Sub meth2");
    }

    void meth3() {
        System.out.println("Sub meth3");
    }
}

public class DynamicMethodDispatch {

    public static void main(String[] args) {
        Super n = new Sub();
        n.meth1();
        n.meth2();
        
        //n.meth3(); Not allowed as ref is of Super class so all the methods of Super class will be available.
    }
}
