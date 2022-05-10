package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    Feline felineMock;

    private final String lionSex;

    public LionTest(String lionSex) {
        this.lionSex = lionSex;
    }

    @Parameterized.Parameters
    public static Object[] getLionSexes() {
        return new Object[]{
                "Самец",
                "Самка"
        };
    }

    @Test
    public void getKittensLion1() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        Lion lion = new Lion(felineMock, lionSex);
        int expectedInt = 1;
        Assert.assertEquals("Invalid number of kittens", expectedInt, lion.getKittens());
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(felineMock, lionSex);
        Boolean expectedBoolean;
        if (lionSex.equals("Самец")) {
            expectedBoolean = true;
        } else {
            expectedBoolean = false;
        }
        Assert.assertEquals("Invalid indicator of mane presence", expectedBoolean, lion.doesHaveMane());
    }

    @Test
    public void getFoodLionListOfAnimalsBirdsFish() throws Exception {
        Lion lion = new Lion(felineMock, lionSex);
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Invalid content of the list", expectedList, lion.getFood());
    }

    @Test
    public void getExceptionFromLionConstructor() throws Exception {
        String invalidLionSex = "qwerty";
        Exception thrown = Assert.assertThrows(Exception.class, () -> new Lion(felineMock, invalidLionSex));
        Assert.assertEquals("Invalid exception message", "Используйте допустимые значения пола животного - самец или самка",
                thrown.getMessage());
    }
}
