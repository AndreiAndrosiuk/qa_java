package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;

    @Test
    public void doesHaveManeMaleOfLionTest() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedMaleOfLionTest = true;
        boolean actualMaleOfLionTest = lion.hasMane;
        Assert.assertEquals(actualMaleOfLionTest, expectedMaleOfLionTest);
    }

    @Test
    public void doesHaveManeFemaleOfLionTest() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expectedFemaleOfLionTest = false;
        boolean actualFemaleOfLionTest = lion.hasMane;
        Assert.assertEquals(actualFemaleOfLionTest, expectedFemaleOfLionTest);
    }

    @Test(expected = Exception.class)
    public void shouldHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion("Другой");
        lion.doesHaveMane();
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самка");
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedGetKittensValueTest = feline.getKittens();
        int actualGetKittensValueTest = lion.getKittens();
        Assert.assertEquals(expectedGetKittensValueTest, actualGetKittensValueTest);
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion("Самец");
        List<String> expectedGetFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFoodList = lion.getFood();
        Assert.assertEquals(expectedGetFoodList, actualGetFoodList);
    }

    @Test
    public void doesHaveManeMale() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedResult = lion.doesHaveMane();
        boolean actualResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeFemale() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expectedResult = lion.doesHaveMane();
        boolean actualResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }
}