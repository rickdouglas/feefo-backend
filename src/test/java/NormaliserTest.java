import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.feefobackend.Normaliser;

public class NormaliserTest {
    @Test
    public void testNormalise() {
        Normaliser normaliser = new Normaliser();

        assertEquals("Software engineer", normaliser.normalise("Java engineer"));
        assertEquals("Software engineer", normaliser.normalise("C# engineer"));
        assertEquals("Accountant", normaliser.normalise("Chief Accountant"));
        assertEquals("Accountant", normaliser.normalise("Accountant"));
        assertEquals("Architect", normaliser.normalise("Architect"));
        assertEquals("Quantity surveyor", normaliser.normalise("Quantity surveyor"));
        assertEquals("Unknown job title", normaliser.normalise("Unknown job title"));
    }
}