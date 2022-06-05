
public class TwoDArrays {
    public static void main(String[] args) {

        int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] c;
        c = new int[5][5];

        // JAGGED ARRAYS

        int A[][];
        A = new int[3][];

        A[0] = new int[4];
        A[1] = new int[7];
        A[2] = new int[5];

        A[0][0] = 6;
        int count = 1;
        for (int x[] : A) {
            for (int y : x) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }

    }

}
