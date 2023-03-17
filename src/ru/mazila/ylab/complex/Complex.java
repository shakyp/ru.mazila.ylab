package ru.mazila.ylab.complex;

import java.util.Objects;

public class Complex {

    private double realPart;
    private double imaginaryPart;

    public Complex() {
    }

    public Complex(double realPart) {
        this.realPart = realPart;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static Complex addition(Complex a, Complex b) {
        return new Complex(a.realPart + b.realPart,
                a.imaginaryPart + b.imaginaryPart);
    }

    public static Complex subtraction(Complex a, Complex b) {
        return new Complex(a.realPart - b.realPart,
                a.imaginaryPart - b.imaginaryPart);
    }

    public static Complex multiplication(Complex a, Complex b) {
        return new Complex(a.realPart * b.realPart -
                a.imaginaryPart * b.imaginaryPart,
                a.realPart * b.imaginaryPart +
                        a.imaginaryPart * b.realPart);
    }

    public double module() {
        return Math.sqrt(this.realPart * this.realPart +
                this.imaginaryPart * this.imaginaryPart);
    }

    private String symbol() {
        if (imaginaryPart > 0) return " + ";
        else return " - ";
    }

    @Override
    public String toString() {
        String string;
        if (imaginaryPart == 1 || imaginaryPart == -1) {
            if (realPart == 0) {
                string = symbol() + "i";
            } else {
                string = realPart + symbol() + "i";
            }
        } else {
            string = realPart + symbol() + Math.abs(imaginaryPart) + "i";
        }
        return string;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.realPart, realPart) == 0 && Double.compare(complex.imaginaryPart, imaginaryPart) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }
}