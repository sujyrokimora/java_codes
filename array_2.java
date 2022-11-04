package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {40, 36, 30, 28, 23, 18, 10, 7, 3};

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "º: " + array[i]);
        }

    }

    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.ROOT);
}
