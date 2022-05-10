package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

public class CatTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline felineMock;

    @Test
    public void getSoundCatMeow() {
        Cat cat = new Cat(felineMock);
        String expectedString = "Мяу";
        Assert.assertEquals("The cat doesn't say meow", expectedString, cat.getSound());
    }

    @Test
    public void getFoodCatListOfAnimalsBirdsFish() throws Exception {
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Cat cat = new Cat(felineMock);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Invalid content of the list", expectedList, cat.getFood());
    }
}
