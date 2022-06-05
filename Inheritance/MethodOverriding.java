class Super {
    public void disp() {

        System.out.println("Hello");
    }
}

class Sub extends Super {
    public void disp() { // Method overriding : redefining method of super class in sub class
        System.out.println("Hello Welcome");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Super s = new Sub();
        s.disp();
    }
}
