import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class FelineTest {
    private final int actualKittensCount;
    private final int expectedKittensCount;

    public FelineTest(int actualKittensCount, int expectedKittensCount) {
        this.actualKittensCount = actualKittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

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
        int expectedInt = 1;
        Assert.assertEquals("Invalid number of kittens", expectedInt, feline.getKittens());
    }

    @Parameterized.Parameters
    public static Object[] getKittensTestData() {
        return new Object[][]{
                {-1, -1},
                {0, 0},
                {1, 1},
                {99, 99}
        };
    }

    @Test
    public void getKittensInputEqualsOutput() {
        Feline feline = new Feline();
        Assert.assertEquals("Output number of kittens doesn't equal input", expectedKittensCount,
                feline.getKittens(actualKittensCount));
    }
}
