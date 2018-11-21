package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Artem Kanevskii
 * @version 0.2
 * @since 21.11.2018
 */
public class MaxTest {
    @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(5, 6);
        assertThat(result, is(6));
    }

    @Test
    public void moreOfTheThree() {
        Max maxim = new Max();
        int result = maxim.max(2, 7, 3);
        assertThat(result, is(7));

    }
}