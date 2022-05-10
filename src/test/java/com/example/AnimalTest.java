package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String animalKind;
    private final ArrayList<String> expectedList;

    public AnimalTest(String animalKind, ArrayList<String> expectedList) {
        this.animalKind = animalKind;
        this.expectedList = expectedList;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalData() {
        return new Object[][] {
                {"Травоядное", new ArrayList<String>(List.of("Трава", "Различные растения"))},
                {"Хищник", new ArrayList<>(List.of("Животные", "Птицы", "Рыба"))}
        };
    }

    @Test
    public void getFoodValidInputs() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Invalid list of food", expectedList, animal.getFood(animalKind));
    }

    @Test
    public void getFoodInvalidInputs() throws Exception {
        Animal animal = new Animal();
        String invalidAnimalKind = "qwerty";
        Exception thrown = Assert.assertThrows(Exception.class, () -> animal.getFood(invalidAnimalKind));
        Assert.assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник",
                thrown.getMessage());
    }

    @Test
    public void getFamilyAnimalCommonPhrase() {
        Animal animal = new Animal();
        String expectedString = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        Assert.assertEquals("Indalid description of animal families", expectedString, animal.getFamily());
    }
}
