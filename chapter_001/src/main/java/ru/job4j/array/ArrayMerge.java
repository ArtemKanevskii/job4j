package ru.job4j.array;
/**
 * Class ArrayMerge
 *
 * Слияние двух отсортированных массива.
 * @author Artem Kanevskii
 * @since 13.03.2019
 * @version 0.1
 */
public class ArrayMerge {
    public int[] arrayMerge(int[] left, int[] right) {
        int[] third = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;

        for (int thirdIndex = 0; thirdIndex < third.length; thirdIndex++) {
            third[thirdIndex] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            if (leftIndex == left.length) {
                System.arraycopy(right, rightIndex, third, ++thirdIndex, right.length - rightIndex);
                break;
            }
            if (rightIndex == right.length) {
                System.arraycopy(left, leftIndex, third, ++thirdIndex, left.length - leftIndex);
                break;
            }
        }
        return third;
    }
}
