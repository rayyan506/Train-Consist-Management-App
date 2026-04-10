import java.util.HashSet;
import java.util.Set;

public class UseCase3TrainConsistManagement {

    public static void main(String[] args) {

        // UC3 Header
        System.out.println("=== UC3: Track Unique Bogie IDs ===\n");

        // Create a Set to store unique bogie IDs
        Set<String> bogies = new HashSet<>();

        // 🔹 ADD IDs (including duplicates)
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");

        // Duplicate entries (will be ignored)
        bogies.add("BG101");
        bogies.add("BG102");

        // Display bogie IDs
        System.out.println("Bogie IDs After Insertion:");
        System.out.println(bogies);

        // Note about duplicates
        System.out.println("\nNote:");
        System.out.println("Duplicates are automatically ignored by HashSet.");

        System.out.println("\nUC3 uniqueness validation completed...");
    }
}