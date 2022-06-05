class MyObj {
    public String toString() {
        return "MyObject55";
    }

    public int hashCode() {
        return 100;
    }

    public boolean equals(MyObj o) {
        return this.hashCode() == o.hashCode();
    }
}

public class langPack {
    public static void main(String[] args) {
        // Object ob1 = new Object();
        // Object ob2 = new Object();

        MyObj ob1 = new MyObj();
        MyObj ob2 = new MyObj();
        MyObj o2 = new MyObj();

        // System.out.println(o2.hashCode());
        System.out.println(ob1.equals(ob2));

        // System.out.println(obj3.hashCode());

        // System.out.println(ob2.hashCode());
        // System.out.println(ob1.toString());
        // System.out.println(ob1.equals(ob2));

    }
}
