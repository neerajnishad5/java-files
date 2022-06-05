@SuppressWarnings("unchecked")

class MyArray<T> {

    int length = 0;

    T obj[] = (T[]) new Object[10]; // Decalring array of type T inheriting object from Object class as we can't create of generic Object directly

    public void append(T v) {
        obj[length++] = v;
    }

    public void disp() {

        for (int i = 0; i < length; i++) {
            System.out.println(obj[i]);
        }
    }
}

public class DGenerics {
    public static void main(String[] args) throws Exception {

        MyArray<Integer> A = new MyArray<>(); // also MyArray<String> can be used as per requirement

        A.append(5);
        A.append(6);
        A.append(90);

        A.disp();
    }
}
