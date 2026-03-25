import java.util.*;

public class UseCase6TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App (UC6) ===");

        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 100);
        bogieCapacityMap.put("Guard", 2);

        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey() +
                    " | Capacity: " + entry.getValue());
        }

        System.out.println("\nProgram Completed Successfully.");
    }
}
