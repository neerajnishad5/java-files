import java.util.*;
public class Adding2Arrays {
    public static void main(String[] args) {
        int a[][] = { { 13, 2, 3 }, { 4, 5, 6 }, { 6, 7, 8 } };

        int b[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
        int c[][] = new int[3][3];

        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 3; j++) {
        // c[i][j] = a[i][j] + b[i][j];
        // System.out.printf("%02d ", c[i][j]);
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 3; i++) {
        //     for (int j = 0; j < 3; j++) {

        //         for (int k = 0; k < 3; k++) {
        //             c[i][j] = c[i][j] + a[i][k] * b[k][j];

        //         }
        //     }

        // }
        // for (int x[] : c) {
        //     for (int y : x) {
        //         System.out.print(y + " ");
        //     }
        //     System.out.println();
        //     ;
        // }

        // Sorting strings using java.util.Arrays.sort method
        String words[] = {"aba","dre", "doc", "em", "kr", "ba", "lamar"};

        java.util.Arrays.sort(words);
        
        for(String x : words)
        System.out.print(x+ " ");

    }
}
