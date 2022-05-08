import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.Assert;

public class CatTest {
    @Test
    public void getSoundCatMeow() {
        Cat cat = new Cat(new Feline());
        String expectedString = "Мяу";
        Assert.assertEquals("The cat doesn't say meow", expectedString, cat.getSound());
    }
}
