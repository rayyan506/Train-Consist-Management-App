import java.util.LinkedList;
import java.util.List;

public class UseCase4TrainConsistManagement {

    public static void main(String[] args) {

        // UC4 Header
        System.out.println("=== UC4: Maintain Ordered Bogie Consist ===\n");

        // Create a LinkedList
        List<String> trainConsist = new LinkedList<>();

        // 🔹 Add bogies in sequence
        trainConsist.add("Engine");
        trainConsist.add("Sleeper");
        trainConsist.add("AC");
        trainConsist.add("Cargo");
        trainConsist.add("Guard");

        // Display initial consist
        System.out.println("Initial Train Consist:");
        System.out.println(trainConsist);

        // 🔹 Insert Pantry Car at position 2 (index 2)
        trainConsist.add(2, "Pantry Car");

        System.out.println("\nAfter Inserting 'Pantry Car' at position 2:");
        System.out.println(trainConsist);

        // 🔹 Remove first and last bogie
        trainConsist.remove(0); // remove Engine
        trainConsist.remove(trainConsist.size() - 1); // remove Guard

        System.out.println("\nAfter Removing First and Last Bogie:");
        System.out.println(trainConsist);

        System.out.println("\nUC4 ordered consist operations completed...");
    }
}