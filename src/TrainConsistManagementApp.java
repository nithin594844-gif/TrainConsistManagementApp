import java.util.Arrays;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UC17: Sort Bogie Names using Array.sort()");
        System.out.println("=========================================");
        String[] arrays = {"Sleeper", "AC_Chair", "First_Class", "General", "Luxury"};
        System.out.println("Original Bogie Names: ");
        for(String arr : arrays)
            System.out.print(arr + " ");
        Arrays.sort(arrays);
        System.out.println("\n\nSorted Bogies Names(Alphabetical): ");
        for(String arr : arrays)
            System.out.print(arr + " ");
        System.out.println("\nUC17 sorting completed....");
    }
}
