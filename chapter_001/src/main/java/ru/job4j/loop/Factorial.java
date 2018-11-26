package ru.job4j.loop;
/**
 * Class Factorial считает факториал от числа n.
 * @author Kanevskii Artem.
 * @since 26.11.2018
 * @version 0.1
 */
public class Factorial {
    /**
     * Метод вычисляет факториал от числа "n".
     *
     * @param n положительное целое число.
     * @return Возвращает рассчитанный факториал для числа "n".
     */
    public int calc(int n) {
        int result = 1;
        for (int x = 1; x <= n; x++) {
            if (n == 0) {
                result = 1;
            }
            result = result * x;
        }
        return result;
    }
}