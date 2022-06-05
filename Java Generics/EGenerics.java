@SuppressWarnings("unchecked")

interface A {
}

class B implements A {
}

class C implements A {
}

class MyArray<T> {

    int length = 0;

    T obj[] = (T[]) new Object[10]; // Decalring array of type T inheriting object from Object class as we can't
                                    // create of generic Object directly

    public void append(T v) {
        obj[length++] = v;
    }

    public void disp() {

        for (int i = 0; i < length; i++) {
            System.out.println(obj[i]);
        }
    }
}

class MyArray2<T> extends MyArray<T> { // here t will act as an object

}

public class EGenerics {
    public static void main(String[] args) {
        MyArray2 ma = new MyArray2();

        ma.append("hello");
        ma.append("Hi");
        ma.append("bye");

        ma.disp();
    }
}
