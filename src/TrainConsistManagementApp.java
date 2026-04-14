import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("UC3: Track Unique Bogie ID's");
        System.out.println("====================================");
        Set<String> bogies = new HashSet<>();
        bogies.add("BG101");
        bogies.add("BG102");
        bogies.add("BG103");
        bogies.add("BG104");
        bogies.add("BG101");
        bogies.add("BG102");
        System.out.println("Bogies ID'd After Insertion: ");
        System.out.println(bogies);
        System.out.println("Note: \nDuplicates are automatically ignored by HashSet.");
        System.out.println("UC3 uniqueness validation completed....");
    }
}
