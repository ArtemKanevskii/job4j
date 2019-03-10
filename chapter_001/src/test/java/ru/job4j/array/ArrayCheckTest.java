package ru.job4j.array;

import org.hamcrest.core.Is;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class ArrayCheckTest {
    @Test
    public void whenArrayCheckSort() {
        ArrayCheck check  = new ArrayCheck();
        int[] input = new int[] {1, 2, 3};
        boolean result = check.sorttest(input);
        assertThat(result, Is.is(true));
    }
    @Test
    public void whenArrayCheckSortTwo() {
        ArrayCheck check  = new ArrayCheck();
        int[] input = new int[] {3, 2, 1};
        boolean result = check.sorttest(input);
        assertThat(result, Is.is(false));
    }
}