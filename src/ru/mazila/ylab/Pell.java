package ru.mazila.ylab;

import java.util.Scanner;

public class Pell {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int n = scanner.nextInt();
            System.out.println(redo(n));
        }
    }

    public static int redo(int n) {

        if (n == 0) return 0;
        if (n == 1) return 1;

        return 2 * redo(n - 1) + redo(n - 2);
    }

}
