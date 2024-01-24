public class Main {

    public static void main(String[] args) {
        // Taking user input for initial fuel supply and the number of vehicles
        int initialFuelSupply = 500;
        int numVehicles = 10;

        FuelStation fuelStation = new FuelStation(initialFuelSupply);

        // Creating RefuelTask and LeaveStationTask threads
        for (int i = 1; i <= numVehicles; i++) {
            Thread refuelThread = new Thread(new RefuelTask(fuelStation, i, 10, 50));
            Thread leaveThread = new Thread(new LeaveStationTask(fuelStation));

            refuelThread.start();
            leaveThread.start();

            try {
                refuelThread.join(); // Wait for refuel to complete before starting the next thread
                leaveThread.join(); // Wait for leave to complete before starting the next thread
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print the final fuel supply
        System.out.println("Final fuel supply: " + fuelStation.getCurrentFuelSupply() + " liters.");
    }

}
