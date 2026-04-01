import java.util.*;
import java.util.stream.Collectors;

// Updated Bogie class with type
class Bogie {
    String name;
    int capacity;
    String type;

    Bogie(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String toString() {
        return name + " (Cap: " + capacity + ")";
    }
}

public class UC9GroupBogies {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC9 - Group Bogies using Streams");
        System.out.println("=====================================");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72, "Passenger"));
        bogies.add(new Bogie("AC Chair", 60, "Passenger"));
        bogies.add(new Bogie("First Class", 40, "Luxury"));

        System.out.println("\nAll Bogies:");
        bogies.forEach(System.out::println);

        // Grouping by type
        Map<String, List<Bogie>> grouped = bogies.stream()
                .collect(Collectors.groupingBy(b -> b.type));

        System.out.println("\nGrouped Bogies:");

        // Print grouped result
        for (Map.Entry<String, List<Bogie>> entry : grouped.entrySet()) {
            System.out.println("\n" + entry.getKey() + " Bogies:");
            entry.getValue().forEach(System.out::println);
        }

        System.out.println("\nUC9 operations completed successfully...");
    }
}