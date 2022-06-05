
interface MyLambda {
    public  void disp(String s);
}

public class MethodReference {

    public MethodReference(String a){ // decalring constructor for meth ref
        System.out.println(a.toUpperCase());
    }

    public static void reverse(String s) {
        StringBuffer str = new StringBuffer(s);
        System.out.println(str.reverse());
    }

    public static void main(String[] args) {

        

        MyLambda m = MethodReference::reverse; // Since MethodReference is static so we passed just by giving name and :: method name

        MyLambda m1 = System.out::println;

        m1.disp("Coronaṇ");

        m.disp("Hello");

        MyLambda m2 = MethodReference::new; // meth referencing constructor, it'll be called on calling disp
        m2.disp("coronavirus");

    }
}
