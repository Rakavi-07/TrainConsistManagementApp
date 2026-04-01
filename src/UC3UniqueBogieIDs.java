import java.util.HashSet;

public class UC3UniqueBogieIDs {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC3 - Track Unique Bogie IDs");
        System.out.println("=====================================");

        // Create HashSet (stores only unique values)
        HashSet<String> bogieIDs = new HashSet<>();

        // Add bogie IDs (with duplicates intentionally)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // duplicate
        bogieIDs.add("BG102"); // duplicate

        System.out.println("\nAfter Adding Bogie IDs (with duplicates):");
        System.out.println("Bogie IDs : " + bogieIDs);

        System.out.println("\nTotal Unique Bogies: " + bogieIDs.size());

        System.out.println("\nUC3 operations completed successfully...");
    }
}