package ru.job4j.max;
/**
 * Class Max
 *
 * Максимум из двух чисел.
 * @author Artem Kanevskii
 * @since 21.11.2018
 * @version 0.2
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
    /**
     * Возвращает максимальное из двух чисел с помощью тернарного условия.
     * @param first - первое число.
     * @param second  - второе число для сравнения с первым.
     * @param third  - треть число для сравнения.
     * @return - максимальное из трех чисел.
     */
    public int max(int first, int second, int third) {
        int temp = this.max(first, second);
        return this.max((temp), third);
    }
}

