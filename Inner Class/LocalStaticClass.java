abstract class My {
    abstract public void show();
}

class Outer1 {
    public void disp() {
        My mm = new My() {
            public void show() {
                System.out.println("Hello from outer1");

            }
        };
        mm.show();
    }
}

class Outer {
    public void disp() {
        // NESTED CLASS
        class Inner {
            public void show() {
                System.out.println("Hello");
            }

        }

        new Inner().show();
        // n.show();
    }
}

class Outer2 {
    int x = 90;
    static int y = 700;

    static class My {

        public void disp() {
            System.out.println(y);
        }
    }

    My m = new My() {
        public void disp() {
            m.disp();
        }
    };
}

public class LocalStaticClass {
    public static void main(String[] args) {
        Outer1 o = new Outer1();
        //o.disp();

        Outer2.My m = new Outer2.My();
        m.disp();

    }
}
