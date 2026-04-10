import org.junit.jupiter.api.Test;
import java.util.regex.Pattern;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase11TrainConsistManagementTest {

    String trainRegex = "TRN-\\d{4}";
    String cargoRegex = "PET-[A-Z]{2}";

    @Test
    void testRegex_ValidTrainID() {
        assertTrue(Pattern.matches(trainRegex, "TRN-1234"));
    }

    @Test
    void testRegex_InvalidTrainIDFormat() {
        assertFalse(Pattern.matches(trainRegex, "TRAIN12"));
        assertFalse(Pattern.matches(trainRegex, "TRN12A"));
        assertFalse(Pattern.matches(trainRegex, "1234-TRN"));
    }

    @Test
    void testRegex_ValidCargoCode() {
        assertTrue(Pattern.matches(cargoRegex, "PET-AB"));
    }

    @Test
    void testRegex_InvalidCargoCodeFormat() {
        assertFalse(Pattern.matches(cargoRegex, "PET-ab"));
        assertFalse(Pattern.matches(cargoRegex, "PET123"));
        assertFalse(Pattern.matches(cargoRegex, "AB-PET"));
    }

    @Test
    void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(Pattern.matches(trainRegex, "TRN-123"));
        assertFalse(Pattern.matches(trainRegex, "TRN-12345"));
    }

    @Test
    void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(Pattern.matches(cargoRegex, "PET-Ab"));
        assertFalse(Pattern.matches(cargoRegex, "PET-aB"));
    }

    @Test
    void testRegex_EmptyInputHandling() {
        assertFalse(Pattern.matches(trainRegex, ""));
        assertFalse(Pattern.matches(cargoRegex, ""));
    }

    @Test
    void testRegex_ExactPatternMatch() {
        assertFalse(Pattern.matches(trainRegex, "TRN-1234X"));
        assertFalse(Pattern.matches(cargoRegex, "PET-ABC"));
    }
}