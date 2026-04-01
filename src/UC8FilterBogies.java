import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// Reuse Bogie class
class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " (Capacity: " + capacity + ")";
    }
}

public class UC8FilterBogies {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC8 - Filter Bogies using Stream");
        System.out.println("=====================================");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Stream + Filter (capacity > 60)
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filteredBogies.forEach(System.out::println);

        System.out.println("\nUC8 operations completed successfully...");
    }
}