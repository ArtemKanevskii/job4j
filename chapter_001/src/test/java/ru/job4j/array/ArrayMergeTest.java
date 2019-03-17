package ru.job4j.array;


import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class ArrayMergeTest {
    @Test
    public void whenAddTwoArrays() {

        ArrayMerge arrayMerge = new ArrayMerge();
        int[] left = new int[] {1, 3, 4};
        int[] right = new int[] {2, 5};
        int[] value = arrayMerge.arrayMerge(left, right);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(value, is(expected));
    }

    @Test
    public void whenAddTwoArraysTwo() {

        ArrayMerge arrayMerge = new ArrayMerge();
        int[] left = new int[] {1,2,3,4,5};
        int[] right = new int[] {2,4,6,7};
        int[] value = arrayMerge.arrayMerge(left, right);
        int[] expected = new int[] {1,2,2,3,4,4,5,6,7};
        assertThat(value, is(expected));
    }
    @Test
    public void whenAddTwoArraysZero() {

        ArrayMerge arrayMerge = new ArrayMerge();
        int[] left = new int[] {};
        int[] right = new int[] {};
        int[] value = arrayMerge.arrayMerge(left, right);
        int[] expected = new int[] {};
        assertThat(value, is(expected));
    }

}