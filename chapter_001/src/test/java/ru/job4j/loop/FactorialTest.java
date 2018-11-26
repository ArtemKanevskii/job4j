package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial sum = new Factorial();
        int result = sum.calc(5);
        assertThat(result, is(120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial sum = new Factorial();
        int result = sum.calc(0);
        assertThat(result, is(1));
    }
}
