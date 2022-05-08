import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class CatTest {
    @Test
    public void getSoundCatMeow() {
        Cat cat = new Cat(new Feline());
        String expectedString = "Мяу";
        Assert.assertEquals("The cat doesn't say meow", expectedString, cat.getSound());
    }

    @Test
    public void getFoodCatListOfAnimalsBirdsFish() throws Exception {
        Cat cat = new Cat(new Feline());
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Invalid content of the list", expectedList, cat.getFood());
    }
}
