public class StringClass {
    public static void main(String[] args) {

        String s = new String("Hello");
        StringBuffer a = new StringBuffer("Hello");
        StringBuilder b = new StringBuilder("Hello ");

        String s1 = s.concat(" Wrold!");
        a.append(" World!");
        b.append(" corona!");

        System.out.println(s);
        System.out.println(a);
        System.out.println(b);
        System.out.println(s1);
    }
}
