import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionTest {

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
        Lion lion = new Lion(new Feline(), lionSex);
        int expectedInt = 1;
        Assert.assertEquals("Invalid number of kittens", expectedInt, lion.getKittens());
    }
}
