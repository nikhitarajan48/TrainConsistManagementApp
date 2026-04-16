import java.util.*;

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "PassengerBogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

public class Main {

    
    public static void sortBogiesByCapacity(List<PassengerBogie> bogies) {
        int n = bogies.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (bogies.get(j).getCapacity() > bogies.get(j + 1).getCapacity()) {
                    PassengerBogie temp = bogies.get(j);
                    bogies.set(j, bogies.get(j + 1));
                    bogies.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        bogies.add(new PassengerBogie("Sleeper", 72));
        bogies.add(new PassengerBogie("AC Chair", 56));
        bogies.add(new PassengerBogie("First Class", 24));
        bogies.add(new PassengerBogie("Sleeper", 70));
        bogies.add(new PassengerBogie("AC Chair", 60));

        System.out.println("Before Sorting:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        sortBogiesByCapacity(bogies);

        System.out.println("\nAfter Sorting by Capacity:");
        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nProgram continues...");
    }
}
