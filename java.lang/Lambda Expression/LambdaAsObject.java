interface MyLambda {
    void disp();
}

class UseLambda {
    void callLambda(MyLambda ml) {
        ml.disp();
    }
}

class Demo {

    void meth() {
        UseLambda ul = new UseLambda();
        ul.callLambda(() -> {
            System.out.println("Hello"); // passing MyLambda whole definition as an object. 
        });
    }

}

public class LambdaAsObject {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.meth();
    }
}
