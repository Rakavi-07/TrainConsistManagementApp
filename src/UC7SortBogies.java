import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class (custom object)
class Bogie {
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // toString() for printing
    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UC7SortBogies {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC7 - Sort Bogies by Capacity");
        System.out.println("=====================================");

        // Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        // Add bogie objects
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBefore Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        // Sort using Comparator (lambda)
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b);
        }

        System.out.println("\nUC7 operations completed successfully...");
    }
}