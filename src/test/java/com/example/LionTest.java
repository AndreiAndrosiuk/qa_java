package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Spy
    Feline feline;

    @Test
    public void getKittens() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самка");
        Assert.assertEquals(1,lion.getKittens());
    }

    @Test
    public void getFood() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самец");
        List<String> expectedGetFoodList = List.of("Животные", "Птицы", "Рыба");
        List<String> actualGetFoodList = lion.getFood();
        Assert.assertEquals(expectedGetFoodList, actualGetFoodList);
    }

    @Test
    public void doesHaveManeMale() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самец");
        boolean expectedResult = lion.doesHaveMane();
        boolean actualResult = true;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void doesHaveManeFemale() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(feline,"Самка");
        boolean expectedResult = lion.doesHaveMane();
        boolean actualResult = false;
        Assert.assertEquals(expectedResult, actualResult);
    }
}