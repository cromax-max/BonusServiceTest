import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1790_00;
        boolean registered = true;
        long expected = 53;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 180_050_00;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1790_00;
        boolean registered = false;
        long expected = 17;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        long amount = 180_050_00;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}