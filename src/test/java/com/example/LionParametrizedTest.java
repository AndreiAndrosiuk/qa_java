package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)

public class LionParametrizedTest {
    private final String sexLion;
    private final boolean expectedLion;

    public LionParametrizedTest(String sexLion, boolean expectedLion) {
        this.sexLion = sexLion;
        this.expectedLion = expectedLion;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void sexLionParametrizedTest() throws Exception {
       Feline feline = new Feline();
       Lion lion = new Lion(feline,sexLion);
       Assert.assertEquals(expectedLion,lion.doesHaveMane());
    }


}
