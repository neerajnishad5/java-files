import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>() ;
        ArrayList<Integer> a2 = new ArrayList<>(List.of(11, 44, 33, 22));

        a.add(55);
        a.add(0, 21);
        a.addAll(1, a2);
        a.add(3, 3);

        System.out.println(a);
        // System.out.println(a.contains(50));
        // System.out.println(a.get(5));
        // System.out.println(a.indexOf(3));

        // for (int i = 0; i < a.size(); i++) {
        // System.out.print(a.get(i) + " ");
        // }

        for (var x : a) { // in foreach loop we can mention 'var' as its not necessary to mention class
                          // name or object type
            System.out.print(x + " ");
        }

        System.out.println();
        Iterator<Integer> it = a.listIterator(); // Iterator has one directional access only

        System.out.println("Printing through iterator class: ");

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nPrinting through List iterator class: ");

        ListIterator<Integer> itt = a.listIterator(); // ListIterator class has bidirectional access as well

        while (itt.hasNext()) {
            System.out.print(itt.next() + " ");
        }

        // a.forEach(n -> {
        // System.out.print(n);
        // }); // printing via foreach w/ using lambda exp

        System.out.println("\nPrinting through fun: ");
        a.forEach(n -> show(n));

    }

    static void show(int n) {

        if (n > 20) {
            System.out.print(n + " ");
        }
    }
}
