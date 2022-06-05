@FunctionalInterface
interface MyLambda {
    public void disp();

}

interface MyLambda2 {
    void disp(String str);
}

interface Add {
    int add(int a, int b);
}

public class LambdaExp {
    public static void main(String[] args) {
        MyLambda m = () -> { // implementing LambdaExpression
            System.out.println("Hello bhai!");
        };

        m.disp();

        MyLambda2 m2 = (s) -> {
            System.out.println(s);
        };

        m2.disp("Kashmir");

        Add A = (a, b) -> a + b; // here automatically a+b is returned without return stmt that's why called LambdaExp yo

        int r = A.add(50, 50);
        System.out.println(r);

    }
}
