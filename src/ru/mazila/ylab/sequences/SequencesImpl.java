package ru.mazila.ylab.sequences;

import java.util.Scanner;

public class SequencesImpl {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int n = scanner.nextInt();
            Sequences sequences = new Sequences();

            sequences.a(n);
            sequences.b(n);
            sequences.c(n);
            sequences.d(n);
            sequences.e(n);
            sequences.f(n);
            sequences.g(n);
            sequences.h(n);
            sequences.i(n);
            sequences.j(n);
        }
    }
}
