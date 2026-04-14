import java.util.LinkedList;
import java.util.List;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("====================================");
        System.out.println("UC4: Maintain Ordered Bogie Consist");
        System.out.println("====================================");
        List<String> trainConsist = new LinkedList<>();
        trainConsist.addLast("Engine");
        trainConsist.addLast("Sleeper");
        trainConsist.addLast("AC");
        trainConsist.addLast("Cargo");
        trainConsist.addLast("Guard");
        System.out.println("Initial Train Consist: ");
        System.out.println(trainConsist);
        trainConsist.add(2,"Pantry Car");
        System.out.println("After Inserting 'Pantry Car' at position 2: ");
        System.out.println(trainConsist);
        trainConsist.removeFirst();
        trainConsist.removeLast();
        System.out.println("After Removing First and Last Bogie: ");
        System.out.println(trainConsist);
        System.out.println("UC4 ordered consist operations completed....");
    }
}
