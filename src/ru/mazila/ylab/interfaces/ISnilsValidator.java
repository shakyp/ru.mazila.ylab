package ru.mazila.ylab.interfaces;

public interface ISnilsValidator {

    /**
     * Проверяет, что в строке содержится валидный номер СНИЛС
     * @param snils снилс
     * @return результат проверки
     */
    boolean validate (String snils);
}
