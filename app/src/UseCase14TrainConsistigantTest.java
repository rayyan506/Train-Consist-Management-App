import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase14TrainConsistigantTest {

    @Test
    void testException_ValidCapacityCreation() throws UseCase14TrainConsistigant.InvalidCapacityException {

        UseCase14TrainConsistigant.PassengerBogie bogie =
                new UseCase14TrainConsistigant.PassengerBogie("Sleeper", 72);

        assertNotNull(bogie);
        assertEquals("Sleeper", bogie.getType());
        assertEquals(72, bogie.getCapacity());
    }

    @Test
    void testException_NegativeCapacityThrowsException() {

        Exception exception = assertThrows(
                UseCase14TrainConsistigant.InvalidCapacityException.class,
                () -> new UseCase14TrainConsistigant.PassengerBogie("AC Chair", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ZeroCapacityThrowsException() {

        Exception exception = assertThrows(
                UseCase14TrainConsistigant.InvalidCapacityException.class,
                () -> new UseCase14TrainConsistigant.PassengerBogie("First Class", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    void testException_ExceptionMessageValidation() {

        UseCase14TrainConsistigant.InvalidCapacityException exception = assertThrows(
                UseCase14TrainConsistigant.InvalidCapacityException.class,
                () -> new UseCase14TrainConsistigant.PassengerBogie("Sleeper", 0)
        );

        assertTrue(exception.getMessage().contains("greater than zero"));
    }

    @Test
    void testException_ObjectIntegrityAfterCreation() throws UseCase14TrainConsistigant.InvalidCapacityException {

        UseCase14TrainConsistigant.PassengerBogie bogie =
                new UseCase14TrainConsistigant.PassengerBogie("First Class", 30);

        assertEquals("First Class", bogie.getType());
        assertEquals(30, bogie.getCapacity());
    }

    @Test
    void testException_MultipleValidBogiesCreation() throws UseCase14TrainConsistigant.InvalidCapacityException {

        UseCase14TrainConsistigant.PassengerBogie b1 =
                new UseCase14TrainConsistigant.PassengerBogie("Sleeper", 72);

        UseCase14TrainConsistigant.PassengerBogie b2 =
                new UseCase14TrainConsistigant.PassengerBogie("AC Chair", 50);

        UseCase14TrainConsistigant.PassengerBogie b3 =
                new UseCase14TrainConsistigant.PassengerBogie("First Class", 30);

        assertNotNull(b1);
        assertNotNull(b2);
        assertNotNull(b3);
    }
}