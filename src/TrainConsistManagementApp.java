public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("UC20: Exception Handling During Search");
        System.out.println("=========================================");
        String[] bogieIds = {};
        String searchId = "BG101";
        try {
            if(bogieIds.length == 0) {
                throw new IllegalStateException("No bogies in train. Cannot perform search.");
            }
            boolean found = false;
            for(String id : bogieIds) {
                if (id.equals(searchId)) {
                    found = true;
                    break;
                }
            }
            if(found)
                System.out.println("Bogie " + searchId + " found using Binary Search");
            else
                System.out.println("Bogie " + searchId + " not found!");
        }
        catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
