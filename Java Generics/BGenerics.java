@SuppressWarnings ("unchecked")
public class BGenerics<T> {

    T data[] = (T[]) new Object[3]; // typecasting object as T type

    public static void main(String[] args) {
        BGenerics<String> gd = new BGenerics();
        gd.data[0] = "byte";
        gd.data[1] = "Hello";
        gd.data[2] = "args";

        String str = gd.data[0];

        System.out.println(str);

    }
}
