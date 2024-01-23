## Assignment: Fuel Station Simulation

#### Background
A fuel station has a limited supply of fuel, and vehicles come in to refuel. The fuel station has a fuel counter that keeps track of the available fuel. Vehicles can refuel concurrently, but the fuel station must ensure that the fuel counter is updated accurately to prevent overselling fuel.

#### Objective
Your task is to simulate a fuel station where multiple threads represent vehicles refueling from the station's fuel supply. You will need to create a `FuelStation` class that manages the fuel supply and ensures thread-safe operations when vehicles refuel. Additionally, you will simulate vehicles leaving the station after refueling, which does not affect the fuel supply but is tracked for station analytics.

#### Requirements
1. Implement a `FuelStation` class with the following features:
   - A private variable to track the available fuel supply.
   - A synchronized method to refuel a vehicle, which should decrement the fuel supply by the amount refueled.
   - A method to get the current fuel supply.

2. Implement two `Runnable` classes:
   - `RefuelTask`: Represents a vehicle refueling. It should call the refuel method of `FuelStation` and print the amount of fuel refueled and the remaining fuel supply.
   - `LeaveStationTask`: Represents a vehicle leaving the station after refueling. It should print a message indicating that a vehicle has left the station.

3. In the `Main` class:
   - Ask the user to enter the initial fuel supply and the number of vehicles to refuel.
   - Create a `FuelStation` object with the initial fuel supply.
   - Create and start multiple threads for `RefuelTask` and `LeaveStationTask`.
   - Ensure that the `RefuelTask` threads do not refuel more fuel than available.
   - Wait for all threads to finish and print the final fuel supply.

#### Example Output
```
Initial fuel supply: 500 liters
Number of vehicles to refuel: 10

Vehicle 1 refueled 50 liters. Remaining fuel: 450 liters.
Vehicle 2 refueled 30 liters. Remaining fuel: 420 liters.
...
Vehicle 10 left the station.
Final fuel supply: 300 liters.
```

#### Notes
- You may assume that each vehicle refuels a random amount of fuel within a specified range (e.g., 10 to 50 liters).
- The `LeaveStationTask` does not affect the fuel supply but should be synchronized with the `RefuelTask` to ensure that vehicles leave in the order they finish refueling.
- Consider edge cases such as running out of fuel and handling attempts to refuel when the supply is insufficient.

This assignment will help you practice thread synchronization, shared resource management, and concurrent programming in Java. 

Good luck!
