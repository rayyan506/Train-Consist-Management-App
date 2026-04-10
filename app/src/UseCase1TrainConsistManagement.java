import java.util.ArrayList;
import java.util.List;

public class UseCase1TrainConsistManagement {

    public static void main(String[] args) {

        // Display welcome banner
        System.out.println("=== Train Consist Management App ===\n");

        // Create a dynamic List to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count: " + trainConsist.size());

        // Display current train consist
        System.out.println("Current Train Consist: " + trainConsist);

        // System ready message
        System.out.println("System ready for operations...");
    }
}