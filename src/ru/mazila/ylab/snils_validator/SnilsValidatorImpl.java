package ru.mazila.ylab.snils_validator;

import ru.mazila.ylab.interfaces.ISnilsValidator;

public class SnilsValidatorImpl implements ISnilsValidator {

    @Override
    public boolean validate(String snils) {

        int mult = 0;
        int num = 9;

        for (int i = 0; i < snils.length() - 2; i++) {
            int x = Character.digit(snils.charAt(i), 10);
            boolean isDigit = Character.isDigit(x);
            if (isDigit && x < 0) {
                return false;
            } else {
                mult += x * num;
                num--;
            }
        }

        int checkNumber;

        if (mult < 100) {
            checkNumber = mult;
        } else if (mult == 100) {
            checkNumber = 0;
        } else {
            int x = mult % 101;
            if (x == 100) {
                checkNumber = 0;
            } else {
                checkNumber = x;
            }
        }

        int junRanks = Integer.parseInt(snils.substring(snils.length() - 2));
        return junRanks == checkNumber;
    }
}
