package ru.mazila.ylab;

import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) throws Exception {

        int number = new Random().nextInt(1, 100);
        System.out.println(number);

        int maxAttempts = 10;
        System.out.println("Я загадал число от 1 до 99. У тебя " + maxAttempts + " " + declination(0, maxAttempts) + " что бы угадать.");

        int countAttempts = 0;

        for (int i = maxAttempts - 1; i >= 0; --i) {

            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();

            countAttempts++;

            if (n == number) {
                System.out.println("Ты угадал с " + countAttempts + " " + declination(1, countAttempts) + ".");
                break;
            } else if (n > number) {
                System.out.println("Моё число меньше! У тебя есть ещё " + i + " " + declination(2, i) + ".");
            } else if (n < number) {
                System.out.println("Моё число больше! У тебя есть ещё " + i + " " + declination(2, i) + ".");
            }

            if (i == 0) {
                System.out.println("Ты не угадал.");
            }

        }

    }

    public static String declination(int text, int i) {

        if (text != 1 && i == 1) {
            return "попытка";
        } else if (text == 1 && i == 1) {
            return "попытки";
        } else if (text == 2 && (i == 2 || i == 3 || i == 4)) {
            return "попытки";
        } else return "попыток";

    }

}
