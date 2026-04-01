import java.util.HashMap;
import java.util.Map;

public class UC6BogieCapacityMap {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC6 - Map Bogie to Capacity");
        System.out.println("=====================================");

        // Create HashMap (Bogie → Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Add bogie-capacity mappings
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 40);

        System.out.println("\nBogie Capacity Details:");

        // Iterate using entrySet()
        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " → Capacity: " + entry.getValue());
        }

        System.out.println("\nUC6 operations completed successfully...");
    }
}