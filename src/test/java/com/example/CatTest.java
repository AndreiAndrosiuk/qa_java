package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Test
    public void getCatSound() {
        Cat cat = new Cat(new Feline());
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);

    }

    @Spy
    Feline feline;

    @Test
    public void getFoodCorrectList() throws Exception {
        Cat cat = new Cat(new Feline());
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFoodList = feline.eatMeat();
        List<String> actualFoodList = cat.getFood();
        Assert.assertEquals(expectedFoodList, actualFoodList);

    }
}