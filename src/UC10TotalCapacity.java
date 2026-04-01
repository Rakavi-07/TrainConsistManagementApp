import java.util.ArrayList;
import java.util.List;

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

public class UC10TotalCapacity {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC10 - Total Seating Capacity");
        System.out.println("=====================================");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 40));

        System.out.println("\nBogies:");
        bogies.forEach(System.out::println);

        // Stream → map → reduce
        int totalCapacity = bogies.stream()
                .map(b -> b.capacity)          // extract capacity
                .reduce(0, Integer::sum);      // sum all values

        System.out.println("\nTotal Seating Capacity: " + totalCapacity);

        System.out.println("\nUC10 operations completed successfully...");
    }
}