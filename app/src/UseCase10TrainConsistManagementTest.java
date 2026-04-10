import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

public class UseCase10TrainConsistManagementTest {

    // 🔹 Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    // 🔹 Helper method (same as main logic)
    int getTotalCapacity(List<Bogie> bogies) {
        return bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);
    }

    // 🔹 Sample data
    List<Bogie> getData() {
        return Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 56),
                new Bogie("First Class", 24),
                new Bogie("Sleeper", 70)
        );
    }

    @Test
    void testReduce_TotalSeatCalculation() {
        int total = getTotalCapacity(getData());
        assertEquals(222, total);
    }

    @Test
    void testReduce_MultipleBogiesAggregation() {
        int total = getTotalCapacity(getData());
        assertTrue(total > 0);
        assertEquals(222, total);
    }

    @Test
    void testReduce_SingleBogieCapacity() {
        List<Bogie> list = Arrays.asList(new Bogie("Sleeper", 50));
        int total = getTotalCapacity(list);
        assertEquals(50, total);
    }

    @Test
    void testReduce_EmptyBogieList() {
        int total = getTotalCapacity(new ArrayList<>());
        assertEquals(0, total);
    }

    @Test
    void testReduce_CorrectCapacityExtraction() {
        int total = getTotalCapacity(getData());
        assertEquals(72 + 56 + 24 + 70, total);
    }

    @Test
    void testReduce_AllBogiesIncluded() {
        int total = getTotalCapacity(getData());
        assertEquals(222, total);
    }

    @Test
    void testReduce_OriginalListUnchanged() {
        List<Bogie> original = new ArrayList<>(getData());
        List<Bogie> copy = new ArrayList<>(original);

        getTotalCapacity(original);

        assertEquals(copy.size(), original.size());
        for (int i = 0; i < original.size(); i++) {
            assertEquals(copy.get(i).name, original.get(i).name);
            assertEquals(copy.get(i).capacity, original.get(i).capacity);
        }
    }
}