import java.util.*;
import java.util.stream.Collectors;

// Base class
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Bogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {

        // Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("Cylindrical", 0)); // Goods bogie
        bogies.add(new Bogie("Rectangular", 0)); // Goods bogie

        // Step 2: Convert list to stream and group by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // Step 3: Display grouped result
        System.out.println("Grouped Bogies by Type:\n");

        for (Map.Entry<String, List<Bogie>> entry : groupedBogies.entrySet()) {
            System.out.println("Type: " + entry.getKey());
            for (Bogie b : entry.getValue()) {
                System.out.println("  " + b);
            }
            System.out.println();
        }

        // Step 4: Verify original list unchanged
        System.out.println("Original List Size: " + bogies.size());
    }
}
