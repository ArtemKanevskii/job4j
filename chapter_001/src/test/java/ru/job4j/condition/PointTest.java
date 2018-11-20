package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test distance to point
 */
public class PointTest {
    @Test
    public void distanceToPoint() {
        Point pointOne  = new Point(1, 2);
        Point pointTwo = new Point(3, 4);
        double result = pointOne.distanceTo(pointTwo);
        double expect = 2.8284271247461903;
        assertThat(result, is(expect));
    }
}
