import java.util.ArrayList;
import java.util.List;

public class UseCase2TrainConsistManagement {

    public static void main(String[] args) {

        // UC2 Header
        System.out.println("=== UC2: Add Passenger Bogies to Train ===\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 CREATE (Add bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 🔹 DELETE (Remove a bogie)
        passengerBogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nAfter Removing \"AC Chair\":");
        System.out.println("Passenger Bogies: " + passengerBogies);

        // 🔹 READ (Check existence)
        System.out.println("\nChecking if \"Sleeper\" exists:");
        boolean exists = passengerBogies.contains("Sleeper");
        System.out.println("Contains Sleeper?: " + exists);

        // 🔹 Final state
        System.out.println("\nFinal Train Passenger Consist:");
        System.out.println(passengerBogies);

        System.out.println("\nUC2 operations completed successfully...");
    }
}