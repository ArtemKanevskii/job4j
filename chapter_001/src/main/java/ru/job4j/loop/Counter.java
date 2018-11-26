package ru.job4j.loop;
/**
 * Class Counter возврашает сумму чётных чисел из диапазона.
 * @author Kanevskii Artem.
 * @since 26.11.2018
 * @version 0.1
 */
public class Counter {
    /**
     * Метод вычисляет сумму чётных чисел в диапазоне.
     * @param start первое число диапазона.
     * @param finish последнее число диапазона.
     * @return Сумма чётных чисел в диапазоне.
     */
    public int add(int start, int finish) {
        int sum = 0;
        for (int x = start; x <= finish; x++) {
            if (x % 2 == 0) {
                sum += x;
            }
        }
        return sum;
    }
}
