package ru.job4j.max;
/**
 * Class Max
 *
 * Максимум из двух чисел.
 * @author Artem Kanevskii
 * @since 20.11.2018
 * @version 0.1
 */

public class Max {
    /**
     * Возвращает максимальное из двух чисел с помощью тернарного условия.
     * @param first - первое число.
     * @param second  - второе число для сравнения с первым.
     * @return - максимальное из двух чисел.
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}

