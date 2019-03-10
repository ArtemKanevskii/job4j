package ru.job4j.array;
/**
 * Class ArrayCheck
 *
 * Проверка массива на сортировку.
 * @author Artem Kanevskii
 * @since 10.03.2019
 * @version 0.1
 */
public class ArrayCheck {
    /**
     * Method sorttest.
     * @param data имя массива.
     * @return  Результат проверки на сортировку  массива.
     */
    public boolean sorttest(int[] data) {
        boolean result = true;
        for (int index = 1; index < data.length; index++) {
            if (data[index] < data[index - 1]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
