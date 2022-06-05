import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        LinkedList<Integer> ll2 = new LinkedList<>(List.of(1, 2, 3, 4, 5));

        ll.add(55);
        ll.add(33);
        ll.addFirst(44);
        ll.addLast(11);

        System.out.println(ll);

        ll.addAll(ll2);

        System.out.println(ll);

        // for (Integer integer : ll) {
        // System.out.print(integer);
        // }

        System.out.println();

        for (int i = 0; i < ll.size(); i++) {
            System.out.print(ll.get(i) + " ");
        }

        System.out.println("Peek first: " + ll.peekFirst()); // returns first element
    }
}
