package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[][] array = {{"40", "Beja"}, {"36", "Cuba"}, {"30", "Pedrogao"}, {"28", "Ferreira"}, {"23", "Aljustrel"}, {"18", "Serpa"}, {"10", "Serpa"}, {"7", "Vidigeuria"}, {"3", "Evora"}};

        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "º: " + array[i][0] + " - " + array[i][1]);
        }

    }
}
