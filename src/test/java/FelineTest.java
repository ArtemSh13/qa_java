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
    @Test
    public void getFamilyFelineFeline() {
        Feline feline = new Feline();
        String expectedString = "Кошачьи";
        Assert.assertEquals("Invalid name of the family", expectedString, feline.getFamily());
    }
    @Test
    public void getKittensEmptyParams1() {
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals("Invalid number of kittens", expected, feline.getKittens());
    }
    
}
