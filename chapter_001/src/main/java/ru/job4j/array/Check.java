package ru.job4j.array;
/**
 * Class Check
 *
 * Проверка массива на True и False.
 * @author Artem Kanevskii
 * @since 28.01.2019
 * @version 0.1
 */

public class Check {
    /**
     * Method mono.
     * @param data имя массива.
     * @result Результат проверки всех элементов в массиве.
     */
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 1; index != data.length; index++) {
            if (data[index] != data[index - 1]) {
                result = false;
            }
        }
        return result;
    }
}