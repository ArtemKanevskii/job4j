package ru.job4j.array;

public class BubbleSort {
    public int[] sort(int[] array) {
        int temp;
        for (int out = array.length - 1; out > 0; out--) {
            for (int index = 0; index < out; index++) {
                if (array[index] > array[index + 1]) {
                    temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
        return array;
    }
}
