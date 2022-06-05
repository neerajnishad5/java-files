public class ReverseNum {
    public static void main(String[] args) {
        int n = 789;
        int m = n;
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        System.out.print(rev);

        if (rev == m)
            System.out.print("\nPalindrome");
        else
            System.out.print("\nNot Palindrome");
    }

}