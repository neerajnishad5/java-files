import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class NestedLoops {
    public static void main(String[] args) {

        // PATTERN 1
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.printf("(%d,%d) ", i,j);
        // // OR
        // System.out.print("(" + i + "," + j + ") ");
        // }
        // System.out.println();
        // }

        // PATTERN 2
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // System.out.print((j + i) + " ");

        // }
        // System.out.println();
        // }

        // PATTERN 3

        // int count = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5; j++) {
        // count++;
        // System.out.printf("%02d ", count);

        // }
        // System.out.println();
        // }
        // 01 02 03 04 05
        // 06 07 08 09 10
        // 11 12 13 14 15
        // 16 17 18 19 20
        // 21 22 23 24 25

        // PATTERN 4

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // }

        // PATTERN 5

        // int count = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // count++;
        // System.out.print(count + " ");
        // }
        // System.out.println();
        // }

        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15

        // PATTERN 6

        // int count = 0;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // count++;
        // System.out.printf("%02d ", count);
        // }
        // System.out.println();
        // }

        // 01
        // 02 03
        // 04 05 06
        // 07 08 09 10
        // 11 12 13 14 15

        // PATTERN 7
        // IMPORTANT**

        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i + 1; j++) {
        // System.out.printf("%d ", j);
        // }
        // System.out.println();
        // }

        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // PATTERN 8
        // for (int i = 1; i <= 7; i++) {
        // for (int j = 1; j <= 7; j++) {
        // if (j>=i)
        // System.out.printf("*");
        // else
        // System.out.printf(" ");
        // }
        // System.out.println();

        // *******
        // ******
        // *****
        // ****
        // ***
        // **
        // *

        // PATTERN 9

        // for (int i = 1; i <= 5; i++) {
        //     for (int j = 1; j <= 5; j++) {
        //         if ((i + j) > 5)
        //             System.out.printf("*");
        //         else
        //             System.out.printf(" ");
        //     }
        //     System.out.println();
        // }

    //      *
    //     **
    //    ***
    //   ****
    //  *****

        // PATTERN 10

    }
}
