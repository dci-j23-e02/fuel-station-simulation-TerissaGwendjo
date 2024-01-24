import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FuelStation {

    private int fuelSupply;
    private final Lock lock = new ReentrantLock();

    public FuelStation(int initialFuelSupply) {
        this.fuelSupply = initialFuelSupply;
    }

    public void refuel(int amount) {
        lock.lock();
        try {
            if (fuelSupply >= amount) {
                System.out.println("Vehicle refueled " + amount + " liters. Remaining fuel: " + (fuelSupply - amount) + " liters.");
                fuelSupply -= amount;
            } else {
                System.out.println("Not enough fuel for the vehicle.");
            }
        } finally {
            lock.unlock();
        }
    }

    public int getCurrentFuelSupply() {
        return fuelSupply;
    }

    public void leaveStation() {
        System.out.println("Vehicle left the station.");
    }

}
