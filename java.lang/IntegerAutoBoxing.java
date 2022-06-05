public class IntegerAutoBoxing {
    public static void main(String[] args) {
        Integer i = Integer.valueOf("55");

        int m1 = 77;

        Integer m2 = m1;
        Integer m4 = 77;
        Integer m3 = Integer.valueOf("1010", 2);
        // System.out.println(m3);
        System.out.println(Integer.decode("0xa")); // converts other number system to decimal system
        System.out.println(Integer.toBinaryString(64)); // converts int to binary

        System.out.println(Integer.parseInt("444"));

        // System.out.println(m4.equals(m1)); // compares value of primitive m4 and
        // object m1

    }
}
