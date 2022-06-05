import java.util.ArrayDeque;

/*Benefits of ArrayDeque

1. This class is likely to be faster than Stack when used as a stack, and faster than LinkedList when used as a queue.

2. Most ArrayDeque operations run in amortized CONSTANT TIME. Exceptions include remove, removeFirstOccurrence, removeLastOccurrence, contains, iterator.remove(), and the bulk operations, all of which run in linear time.

*/
public class ArrayDequeDemo { // DeQue: double ended Queue
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offerLast(10);
        ad.offerLast(20);
        ad.offerLast(30);
        ad.offerLast(40);

        ad.offerFirst(55);
        ad.offerFirst(22);
        ad.offerFirst(33);
        ad.offerFirst(11);

        ad.forEach((x) -> System.out.print(x + " "));

        

    }
}
