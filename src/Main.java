import java.util.*;

public class Main {

    
    static boolean searchBogie(String[] bogieIds, String searchKey) {
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        String[] bogieIds = {
            "BG101",
            "BG205",
            "BG309",
            "BG412",
            "BG550"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Available Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = searchBogie(bogieIds, searchKey);

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found in consist.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}