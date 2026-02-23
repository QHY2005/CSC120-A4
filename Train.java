
import java.util.ArrayList;

/**
 * This Train class represents a train composed of one Engine and multiple passenger Cars.
 * In this Train class, it shows that it can create and store its Engine and Cars.
 * Besides, it can also report total capacity and available seats, and even print a full passenger manifest
 */
public class Train implements TrainRequirements {

    private Engine engine;
    private ArrayList<Car> cars;

/**
 * This constructs a Train with a specified engine and specified number of passenger Cars.
 * @param fuelType, shows the type of fuel used by the Engine
 * @param currentFuelLevel, shows the initial fuel level of the Engine
 * @param fuelCapacity, shows the maximum fuel capacity of the Engine
 * @param nCars, shows the number of passenger Cars to attach
 * @param passengerCapacity, shows the maximum seating capacity of each Car
 */
public Train(FuelType fuelType, double currentFuelLevel, double fuelCapacity, int nCars, int passengerCapacity) {
    engine = new Engine(fuelType, currentFuelLevel, fuelCapacity);
    cars = new ArrayList<>();
    for (int i = 0; i < nCars; i++) {
        cars.add(new Car(passengerCapacity));
    }
}


/**
 * This returns the Engine of this Train.
 */
public Engine getEngine() {
    return engine;
}

/**
 * This returns the Car at its order/position.
 * @param i , shows the order/position of the Car
 */
public Car getCar(int i) {
    return cars.get(i);
}

/**
 * This returns the maximum total passenger capacity of the entire Train.
 */
public int getMaxCapacity() {
    int totalCapacity = 0;
    for (Car c : cars) {
        totalCapacity += c.getCapacity();
    }
    return totalCapacity;
    }

/**
 * This returns the total number of seats remaining across the entire train.
 */
public int seatsRemaining() {
    int remainingSeats = 0;
    for (Car c : cars) {
        remainingSeats += c.seatsRemaining();
    }
    return remainingSeats;
    }

/**
 * This prints a complete passenger manifest of the Train.
 */
public void printManifest() {
    for (int i = 0; i < cars.size(); i++) {
        System.out.println("Car " + i + ":");
        cars.get(i).printManifest();
    }
}
}