public class loops2 {
    public static void main(String[] args) {

        // to count digits of a number
        int n = 74543651,count = 0;
        int digit = 0;
        while (n > 0) {
        digit = n % 10;
        count = count + 1;
        n = n / 10;

        }
        
        System.out.println(count);

        

        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count);





    }
}
