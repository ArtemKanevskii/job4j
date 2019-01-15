package ru.job4j.array;

/**
 * Class Square
 *
 * Заполнения цикла элементами от 1 до bound
 * @author Artem Kanevskii
 * @since 15.01.2019
 * @version 0.1
 */

public class Square {
    /**
     * Метод заполняет массив числами возведенными в квадрат.
     *
     * @param bound - длина массива.
     * @return массив.
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 1; index <= bound; index++) {
            rst[index - 1] = index * index;
        }
        return rst;
    }
}