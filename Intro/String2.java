import javax.print.event.PrintEvent;

public class String2 {
    public static void main(String[] args) {
        String s0 = "www.abcdef.com";

        System.out.println(s0.length());
        int i0 = s0.lastIndexOf("o");

        int i1 = s0.lastIndexOf(".", 10); // lastIndexOf method starts finding index of parameter string from 15th
                                          // position right to left VERY VERY IMPORTANT

        System.out.println(i0);
        System.out.println(i1);

        String s1 = "Mr. Shah Rukh Khan";

        boolean b = s1.endsWith("Khan");

        System.out.println(b);

        String s2 = "JAVA";
        String s3 = "PYTHON";
        String s4 = "JAVA";

        System.out.println(s2.equals(s4)); // boolean equals(string S) checks if two strings are exactly same in terms of content.

        String s5 = new String("JAVA");

        System.out.println(s4.equals(s5));
        System.out.println(s4==s5);
        System.out.println(s4==s2);

        String s6 = "aORONA VACCINE";
        String s7 = "bava";

        System.out.println(s7.compareTo(s6)); // Here, string s7 is compared with s8 and difference b/w a and b is returned
        
    }
}
