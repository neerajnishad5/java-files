import java.lang.invoke.CallSite;

interface MyLambda {
    public void disp();
}

class Demo {

    public void meth1() {
        MyLambda m = ()->{System.out.println("Hello");};

        m.disp();
    }
}

public class LambdaCapture {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.meth1();

    }
}
