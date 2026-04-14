public class TrainConsistManagementApp {
    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }
    static class GoodsBogie {
        String shape;
        String cargo;
        GoodsBogie(String shape) {
            this.shape = shape;
        }
        void assignCargo(String cargo) {
            try {
                if(shape.equals("Rectangular") && cargo.equals("Petroleum")) {
                    throw new CargoSafetyException("Error: Unsafe cargo assignment!");
                }
                this.cargo = cargo;
                System.out.println("Cargo assigned successfully -> " + cargo);
                System.out.println("Cargo validation completed for " + shape + " bogie");
            }
            catch (CargoSafetyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("UC15: Safe Cargo Assignment");
        System.out.println("===========================");
        GoodsBogie g1 = new GoodsBogie("Cylindrical");
        GoodsBogie g2 = new GoodsBogie("Rectangular");
        g1.assignCargo("Petroleum");
        g2.assignCargo("Petroleum");
        System.out.println("UC15 runtime handling completed....");
    }
}
