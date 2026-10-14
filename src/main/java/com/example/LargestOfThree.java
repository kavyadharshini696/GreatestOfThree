
package com.example;

public class LargestOfThree {

    public static int findLargest(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        System.out.println("Largest number: "
                + findLargest(a, b, c));
    }
}
