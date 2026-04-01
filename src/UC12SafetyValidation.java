import java.util.ArrayList;
import java.util.List;

// Goods Bogie class
class GoodsBogie {
    String type;   // Rectangular / Cylindrical
    String cargo;  // Coal / Petroleum

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String toString() {
        return type + " Bogie carrying " + cargo;
    }
}

public class UC12SafetyValidation {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("   UC12 - Safety Validation");
        System.out.println("=====================================");

        // Create goods bogies
        List<GoodsBogie> bogies = new ArrayList<>();

        bogies.add(new GoodsBogie("Rectangular", "Coal"));
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Rectangular", "Grain"));

        System.out.println("\nGoods Bogies:");
        bogies.forEach(System.out::println);

        // Safety Rule:
        // Cylindrical → only Petroleum allowed
        boolean isSafe = bogies.stream()
                .allMatch(b -> {
                    if (b.type.equals("Cylindrical")) {
                        return b.cargo.equals("Petroleum");
                    }
                    return true;
                });

        // Result
        if (isSafe) {
            System.out.println("\nTrain is SAFE ✅");
        } else {
            System.out.println("\nTrain is NOT SAFE ❌");
        }

        System.out.println("\nUC12 operations completed successfully...");
    }
}