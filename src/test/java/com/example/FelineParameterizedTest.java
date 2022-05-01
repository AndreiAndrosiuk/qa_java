package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class FelineParameterizedTest {
    private final int kittensCount;
    private final int kittensCountExpected;

    public FelineParameterizedTest(int kittensCount, int kittensCountExpected) {
        this.kittensCount = kittensCount;
        this.kittensCountExpected = kittensCountExpected;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {5, 5},
                {10, 10},
        };
    }

    @Test
    public void shouldBeKittensCount() {
        Feline feline = new Feline();
        int actualResult = kittensCount;
        int expectedResult = kittensCountExpected;
        Assert.assertEquals(kittensCount, kittensCountExpected);
    }
}
