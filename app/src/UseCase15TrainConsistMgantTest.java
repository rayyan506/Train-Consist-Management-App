import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase15TrainConsistMgantTest {

    @Test
    void testCargo_SafeAssignment() {
        UseCase15TrainConsistMgant.GoodsBogie bogie =
                new UseCase15TrainConsistMgant.GoodsBogie("Cylindrical");

        bogie.assignCargo("Petroleum");

        assertEquals("Petroleum", bogie.getCargo());
    }

    @Test
    void testCargo_UnsafeAssignmentHandled() {
        UseCase15TrainConsistMgant.GoodsBogie bogie =
                new UseCase15TrainConsistMgant.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        // cargo should NOT be assigned
        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_CargoNotAssignedAfterFailure() {
        UseCase15TrainConsistMgant.GoodsBogie bogie =
                new UseCase15TrainConsistMgant.GoodsBogie("Rectangular");

        bogie.assignCargo("Petroleum");

        assertNull(bogie.getCargo());
    }

    @Test
    void testCargo_ProgramContinuesAfterException() {

        UseCase15TrainConsistMgant.GoodsBogie b1 =
                new UseCase15TrainConsistMgant.GoodsBogie("Rectangular");

        UseCase15TrainConsistMgant.GoodsBogie b2 =
                new UseCase15TrainConsistMgant.GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // fails
        b2.assignCargo("Coal");      // should still work

        assertNull(b1.getCargo());
        assertEquals("Coal", b2.getCargo());
    }

    @Test
    void testCargo_FinallyBlockExecution() {

        UseCase15TrainConsistMgant.GoodsBogie bogie =
                new UseCase15TrainConsistMgant.GoodsBogie("Rectangular");

        // We can't directly assert finally, but ensure method completes safely
        assertDoesNotThrow(() -> bogie.assignCargo("Petroleum"));
    }
}