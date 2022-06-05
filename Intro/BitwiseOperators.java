import java.util.*;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 90;
        int b = 10;
        int c = 8;
        // a = a | b;
        c = c << 4;
        c = c | a;
        int x = 0b11111111;
        x = x & c;
        System.out.println(a);
        System.out.println(b);

        // SWAPPING using BITWISE
        a = a ^ b; // In this operation value of 'a' wouldn't be more than the max value of (a,b)
        b = a ^ b;
        a = a ^ b;

        System.out.println(a);
        System.out.println(b);
        System.out.println(x);

        // BITWISE MASKING values store in different nibbles

        byte aa = 8, bb = 10;

        byte cc;

        cc = (byte) (aa << 4);
        cc = (byte) (cc | bb);

        System.out.println((cc & 0b11110000) >> 4);
        System.out.println((cc & 0b00001111));

    }
}
