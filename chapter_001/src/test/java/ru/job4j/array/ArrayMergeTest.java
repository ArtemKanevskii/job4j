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

}