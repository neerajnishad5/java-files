public class RegularExp {
    public static void main(String[] args) {
        String s0 = new String("AB");

        System.out.println(s0.matches("AB"));

        String s1 = "  ";
        System.out.println(s1.matches("\\s"));

        String s3 = "6";
        System.out.println(s3.matches("\\d")); // checks for if there's a DIGIT in s3; d: digit

        String s4 = "$";
        System.out.println(s4.matches("\\D")); // checks for if there's NOT A DIGIT in s4; D: NOT A DIGIT


        String s2 = "aabbc";

        System.out.println(s2.matches("[abc]{5}")); // checks if s2 is a string containing only abc and 5 lettered.

        String s5 = "neeraj";
        System.out.println("s5 ka answer: "+ s5.matches("[a-z]+")); // checks if s5 contains string a to z lettered string with 0 or more length

        String s6 = "Neeraj Nishad";

        System.out.println("s5 ka answer: "+ s6.matches("[a-zA-Z\\s]{5,13}"));

        String email = new String("johncena@gmail.com");

        System.out.println("email ka answer: "+ email.matches("\\w+@gmail.*")); // Checking for string if it contains letters and alphas before @gmail and followed by anything. NOTE : .* and (.*) both are same


    }
}
