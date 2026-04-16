import java.util.*;

public class Main {

    // Binary Search Method
    static boolean binarySearchBogie(String[] bogieIds, String searchKey) {
        Arrays.sort(bogieIds);   // ensure sorted before searching

        int low = 0;
        int high = bogieIds.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            int result = searchKey.compareTo(bogieIds[mid]);

            if (result == 0) {
                return true;     // found
            } else if (result < 0) {
                high = mid - 1;  // search left half
            } else {
                low = mid + 1;   // search right half
            }
        }

        return false; // not found
    }

    public static void main(String[] args) {

        String[] bogieIds = {
            "BG309",
            "BG101",
            "BG550",
            "BG205",
            "BG412"
        };

        Scanner sc = new Scanner(System.in);

        System.out.println("Original Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        System.out.print("\nEnter bogie ID to search: ");
        String searchKey = sc.nextLine();

        boolean found = binarySearchBogie(bogieIds, searchKey);

        System.out.println("\nSorted Bogie IDs:");
        System.out.println(Arrays.toString(bogieIds));

        if (found) {
            System.out.println("Bogie ID " + searchKey + " found.");
        } else {
            System.out.println("Bogie ID " + searchKey + " not found.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}