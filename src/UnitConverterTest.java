import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class UnitConverterTest {
    private static UnitConverter uc;

    @BeforeClass
    public static void setup() {
        uc = new UnitConverter();
    }

    @Test
    public void test_distance_converter() {
        assertEquals( 280,uc.distance_converter(2));
    }

    @Test
    public void test_weight_converter() {
        assertEquals( 8,uc.weight_converter(5));
    }

    @Test
    public void test_temperature_converter() {
        assertEquals( 32,uc.temperature_converter(20));
    }

    @Test
    public void test_volume_converter() {
        assertEquals( 126,uc.volume_converter(4));
    }
}
