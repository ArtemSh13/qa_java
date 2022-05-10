package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AlexLionTest {
    @Test
    public void getKittensAlex0() throws Exception {
        AlexLion alexLion = new AlexLion();
        int expectedInt = 0;
        Assert.assertEquals("Invalid number of Alex's kittens", expectedInt, alexLion.getKittens());
    }

    @Test
    public void getFriendsAlexList() throws Exception {
        AlexLion alexLion = new AlexLion();
        List<String> expectedList = List.of("Марти", "Глория", "Мелман");
        Assert.assertEquals("Invalid content of the friends list", expectedList, alexLion.getFriends());
    }

    @Test
    public void getPlaceOfLivingAlexNewYorkZoo() throws Exception {
        AlexLion alexLion = new AlexLion();
        String expectedString = "Нью-Йоркский зоопарк";
        Assert.assertEquals("Invalid place of Alex's living", expectedString, alexLion.getPlaceOfLiving());
    }
}
