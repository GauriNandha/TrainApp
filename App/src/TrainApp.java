import java.util.ArrayList;
import java.util.List;

public class TrainApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");
        List<String> passengerBogies = new ArrayList<>();
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);
        passengerBogies.remove("AC Chair");

        System.out.println("\nPassenger bogies after removal of AC Chair:");
        System.out.println(passengerBogies);
        boolean isSleeperPresent = passengerBogies.contains("Sleeper");
        System.out.println("\nIs Sleeper bogie present? " + isSleeperPresent);
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);
    }
}