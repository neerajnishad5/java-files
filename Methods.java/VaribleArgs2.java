public class VaribleArgs2 {
    

    static int max(int... x) { // max value using VarArgs
        if (x.length == 0)
            return Integer.MIN_VALUE;
        int max = x[0];

        for (int i = 0; i < x.length; i++) {
            if (x[i] > max)
                max = x[i];
        }
        return max;
    }

    static int sum(int... x) { // max value using VarArgs
        if (x.length == 0)
            return Integer.MIN_VALUE;
        int sum = x[0];

        for (int i = 1; i < x.length; i++) {
            sum = sum + x[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        System.out.println(max());
        System.out.println(sum(new int[] { 1, 2, 3, 4, 5 })); // on the fly array
         

        
    }
}
