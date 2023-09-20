import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

    @Test
    @DisplayName("Test of 6 / 2")
    public void testDivision() {
        assertEquals(3, Main.division(6, 2), "6 / 2 must be 3");
    }

    @Test
    @DisplayName("Test of 6 / 0")
    public void testDivisionByZero() {
        assertEquals(0, Main.division(6, 0), "6 / 0 must be 0");
    }
}
