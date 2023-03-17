package ru.mazila.ylab.snils_validator;

public class Main {
    public static void main(String[] args) {

        System.out.println(new SnilsValidatorImpl().validate("01468870570"));
        System.out.println(new SnilsValidatorImpl().validate("90114404441"));

        System.out.println(new SnilsValidatorImpl().validate("90114404441"));
        System.out.println(new SnilsValidatorImpl().validate("12313412123"));
    }
}
