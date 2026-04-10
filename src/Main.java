import java.util.*;

class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

class PassengerBogie {
    private String type;
    private int capacity;

    public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
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
        return "PassengerBogie{type='" + type + "', capacity=" + capacity + "}";
    }
}

public class Main {
    public static void main(String[] args) {

        List<PassengerBogie> bogies = new ArrayList<>();

        try {
            bogies.add(new PassengerBogie("Sleeper", 72));
            bogies.add(new PassengerBogie("AC Chair", 50));
            bogies.add(new PassengerBogie("First Class", 40));

            bogies.add(new PassengerBogie("Sleeper", -10));
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }

        for (PassengerBogie b : bogies) {
            System.out.println(b);
        }
    }
}
