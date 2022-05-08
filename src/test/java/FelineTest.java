import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;

import java.util.List;

public class FelineTest {
    @Test
    public void eatMeatFelineListOfAnimalsBirdsFish() throws Exception {
        Feline feline = new Feline();
        List<String> expectedList = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals("Invalid content of the list", expectedList, feline.eatMeat());
    }

}
