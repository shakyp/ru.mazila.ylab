package ru.mazila.ylab.complex;

public class Main {

    public static void main(String[] args) {

            Complex n = new Complex(4);
            System.out.println("n = " + n + "\n");

            Complex x = new Complex(6, 7);
            Complex y = new Complex(-9, 2);
            System.out.println("z1 = " + x);
            System.out.println("z2 = " + y + "\n");

            Complex z;
            z = Complex.addition(x, y);
            System.out.println("+: " + z);

            z = Complex.subtraction(x, y);
            System.out.println("-: " + z);

            z = Complex.multiplication(x, y);
            System.out.println("*: " + z + "\n");

            System.out.println("[z] = " + z.module());
    }
}
