import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {
    static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }
    static class PassangerBogie {
        String type;
        int capacity;
        PassangerBogie(String type, int capacity) throws InvalidCapacityException {
            this.type = type;
            this.capacity = capacity;
            if(capacity <= 0)
                throw new InvalidCapacityException("Error: Capacity must be greater than zero");
        }
    }
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("UC14: Handle Invalid Bogie Capacity");
        System.out.println("====================================");
        List<PassangerBogie> bogies = new ArrayList<>();
        try {
            bogies.add(new PassangerBogie("AC Chair",-24));
            bogies.add(new PassangerBogie("Sleeper",72));
        }
        catch(InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Created Bogies: ");
        for(PassangerBogie b : bogies)
            System.out.println(b.type + " -> " + b.capacity);
        System.out.println("UC14 exception handling completed....");
    }
}
