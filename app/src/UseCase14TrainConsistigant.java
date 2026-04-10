public class UseCase14TrainConsistigant {

    public static class InvalidCapacityException extends Exception {
        public InvalidCapacityException(String message) {
            super(message);
        }
    }

    public static class PassengerBogie {
        private String type;
        private int capacity;

        public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be greater than zero");
            }
            this.type = type;
            this.capacity = capacity;
        }

        public String getType() {
            return type;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public String toString() {
            return "Created Bogie: " + type + " -> " + capacity;
        }
    }

    public static void main(String[] args) {
        try {
            PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
            System.out.println(b1);

            PassengerBogie b2 = new PassengerBogie("AC Chair", 0); // invalid
            System.out.println(b2);

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("UC14 exception handling completed...");
    }
}