import java.util.*;

public class UseCase2TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        List<String> passengerBogies = new ArrayList<>();

        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("Bogies after addition: " + passengerBogies);

        passengerBogies.remove("AC Chair");

        System.out.println("After removal: " + passengerBogies);

        System.out.println("Sleeper exists? " + passengerBogies.contains("Sleeper"));

        System.out.println("Final bogie list: " + passengerBogies);
    }
}
