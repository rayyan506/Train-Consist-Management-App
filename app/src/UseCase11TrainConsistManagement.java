import java.util.Scanner;
import java.util.regex.Pattern;

public class UseCase11TrainConsistManagement {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 🔹 Accept input
        System.out.print("Enter Train ID (Format: TRN-1234): ");
        String trainId = scanner.nextLine();

        System.out.print("Enter Cargo Code (Format: PET-AB): ");
        String cargoCode = scanner.nextLine();

        // 🔹 Define regex patterns
        String trainRegex = "TRN-\\d{4}";
        String cargoRegex = "PET-[A-Z]{2}";

        // 🔹 Validate using Pattern.matches()
        boolean isTrainValid = Pattern.matches(trainRegex, trainId);
        boolean isCargoValid = Pattern.matches(cargoRegex, cargoCode);

        // 🔹 Display results
        System.out.println("\nValidation Results:");
        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);

        System.out.println("\nUC11 validation completed...");
    }
}