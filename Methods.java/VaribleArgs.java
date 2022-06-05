public class VaribleArgs {
    
    static void prints(int i, String... s) {
        for (String x : s) {
            System.out.println(i + ". " + x);
            i++;
        }
    }

    static void show(int... n) {
        for (int x : n) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        show();
        // show(10, 20, 30);

        // show(new int[] { 0x90, 0x54a, 0x10, 0xA, 55 }); // this array passed is
        // called 'on the fly' array as it's used and then deleted, also called
        // anonymous array as it doesn't have a reference.
        // show(10, 20, 30, 40, 33, 22, 11, 22, 545);

        prints(1, "rames", "shah", "rukh", "khan", "china");

        
    }
}
