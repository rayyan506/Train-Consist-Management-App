import java.util.*;
import java.util.stream.*;

public class UseCase10TrainConsistManagement {

    // 🔹 Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=== UC10: Count Total Seats in Train ===\n");

        // 🔹 Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 70));

        // 🔹 Display bogies
        System.out.println("Bogies in Train:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // 🔹 AGGREGATION using map + reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)
                .reduce(0, Integer::sum);

        // 🔹 Display result
        System.out.println("\nTotal Seating Capacity of Train: " + totalCapacity);

        System.out.println("\nUC10 aggregation completed...");
    }
}