public class AGenerics {
    public static void main(String[] args) throws Exception {
        Object obj = new String("Hii");

        String str = (String) obj;

        System.out.println(str);

        Object obj1[] = new Object[3];

        obj1[0] = "Hello";
        obj1[1] = "Hi";
        obj1[2] = "Pikachu";


        String s;

        for (int i = 0; i < 3; i++) {
            s = (String)obj1[i];
            System.out.println(s);
        }
    }
}