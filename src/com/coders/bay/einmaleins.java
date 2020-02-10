package com.coders.bay;

public class einmaleins {
    public static void main(String[] args) {

        for (int k = 1; k <= 10; ) {

            System.out.printf("\n%der Reihe:\n\n", k);

            for (int i = 1; i <= 10; i++) {

                System.out.printf("%2d * %2d = %3d\n", k, i, k * i);
            }
            ++k;
        }

    }
}
