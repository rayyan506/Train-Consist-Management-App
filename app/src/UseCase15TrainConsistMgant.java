public class UseCase15TrainConsistMgant {

    static class CargoSafetyException extends RuntimeException {
        public CargoSafetyException(String message) {
            super(message);
        }
    }

    static class GoodsBogie {
        private String shape;
        private String cargo;

        public GoodsBogie(String shape) {
            this.shape = shape;
        }

        public String getShape() {
            return shape;
        }

        public String getCargo() {
            return cargo;
        }

        public void assignCargo(String cargo) {
            try {
                // Rule: Rectangular bogie cannot carry petroleum
                if (shape.equalsIgnoreCase("Rectangular") &&
                        cargo.equalsIgnoreCase("Petroleum")) {
                    throw new CargoSafetyException(
                            "Unsafe cargo: Petroleum cannot be carried in Rectangular bogie"
                    );
                }

                this.cargo = cargo;
                System.out.println("Cargo assigned: " + cargo + " -> " + shape);

            } catch (CargoSafetyException e) {
                System.out.println("Error: " + e.getMessage());

            } finally {
                System.out.println("Cargo assignment attempt completed.");
            }
        }
    }

    public static void main(String[] args) {

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        b1.assignCargo("Petroleum"); // safe

        GoodsBogie b2 = new GoodsBogie("Rectangular");
        b2.assignCargo("Petroleum"); // unsafe

        GoodsBogie b3 = new GoodsBogie("Rectangular");
        b3.assignCargo("Coal"); // safe

        System.out.println("UC15 execution continues...");
    }
}