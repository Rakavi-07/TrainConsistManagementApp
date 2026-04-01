import java.util.LinkedHashSet;

public class UC5LinkedHashSetConsist {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC5 - Preserve Insertion Order");
        System.out.println("=====================================");

        // Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Add duplicate intentionally
        train.add("Sleeper");

        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nTotal Bogies: " + train.size());

        System.out.println("\nUC5 operations completed successfully...");
    }
}