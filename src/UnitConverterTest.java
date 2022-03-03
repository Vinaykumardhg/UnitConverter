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
        assertEquals( 2,uc.distance_converter(2));
    }

    @Test
    public void test_weight_converter() {
        assertEquals( 8,uc.distance_converter(5));
    }

    @Test
    public void test_temperature_converter() {
        assertEquals( 32,uc.distance_converter(20));
    }

    @Test
    public void test_volume_converter() {
        assertEquals( 126,uc.distance_converter(4));
    }
}
