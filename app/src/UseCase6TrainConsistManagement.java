import java.util.HashMap;
import java.util.Map;

public class UseCase6TrainConsistManagement {

    public static void main(String[] args) {

        // UC6 Header
        System.out.println("=== UC6: Map Bogie to Capacity (HashMap) ===\n");

        // Create a HashMap to store bogie-capacity mapping
        Map<String, Integer> capacityMap = new HashMap<>();

        // 🔹 Insert bogie capacities
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // 🔹 Display bogie capacity details
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed...");
    }
}