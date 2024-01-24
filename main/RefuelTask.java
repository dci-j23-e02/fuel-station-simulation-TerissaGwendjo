import java.util.Random;

class RefuelTask implements Runnable {
    private final FuelStation fuelStation;
    private final int vehicleNumber;
    private final int minRefuelAmount;
    private final int maxRefuelAmount;

    public RefuelTask(FuelStation fuelStation, int vehicleNumber, int minRefuelAmount, int maxRefuelAmount) {
        this.fuelStation = fuelStation;
        this.vehicleNumber = vehicleNumber;
        this.minRefuelAmount = minRefuelAmount;
        this.maxRefuelAmount = maxRefuelAmount;
    }

    @Override
    public void run() {
        int refuelAmount = new Random().nextInt(maxRefuelAmount - minRefuelAmount + 1) + minRefuelAmount;
        fuelStation.refuel(refuelAmount);
    }
}
