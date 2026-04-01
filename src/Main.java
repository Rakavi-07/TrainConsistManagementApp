import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("=== Train Consist Management App ===");
        System.out.println("=====================================");

        // Create empty list (train consist)
        List<String> bogies = new ArrayList<>();

        System.out.println("\nTrain initialized successfully...");
        System.out.println("Initial Bogie Count : " + bogies.size());
        System.out.println("Current Train Consist : " + bogies);

        System.out.println("\nSystem ready for operations...");
    }
}