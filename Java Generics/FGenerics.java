public class FGenerics {
    static <E> void show(E[] list) { // signature for Generic method

        /*
         * static <E> void show(E... list) <- we can use variable args as well for
         * receving array of elemnts
         */

        for (E x : list) {

            System.out.print(x + " ");
        }

    }

    public static void main(String[] args) {

        show(new String[] { "Hello", "String", "Python" });

        show(new Integer[] { 10, 20, 30, 40 });
    }
}
