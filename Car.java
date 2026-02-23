
import java.util.ArrayList;

/**
 * The Car class represents a passenger car on a Train.
 * This class stores a list of Passengers currently onboard and has fixed maximum capacity 
 * The Car provides methods to add/remove passengers and to print a manifest.
 */

public class Car implements CarRequirements {

    private int capacity;
    private ArrayList<Passenger> passengers;


/**
 * This constructs a Car with limited seating capacity.
 * @param maximum capacity of the car
 */
public Car(int capacity) {
    this.capacity = capacity;
    this.passengers = new ArrayList<>();
}

/**
 * This returns the maximum seating capacity of this car.
 */
public int getCapacity(){
    return capacity;
}

/**
 * This returns the number of available seats remaining in this car.
 */
public int seatsRemaining() {
    return capacity - passengers.size();
}

/**
 * This add a Passenger to this car when at least one seat available and return whether passenger was successfully added.
 * @param p the Passenger to be added
 */

public Boolean addPassenger(Passenger p) {

    if (seatsRemaining() <= 0) {
        return false;
    }

    passengers.add(p);
    return true;
}

/**
 * This removes a Passenger from this car and return whether the passenger has been successfully been removed or not.
 * @param p the Passenger to remove
 */
public Boolean removePassenger(Passenger p) {

    if (!passengers.contains(p)) {
        return false;
    }

    passengers.remove(p);
    return true;
}


/**
 * This prints a list of all passengers currently in the car.
 * If the car is empty, prints "This car is EMPTY."
 */
public void printManifest() {
    if (passengers.size() == 0) {
        System.out.println("This car is EMPTY.");
        return;
    }
    for (Passenger p : passengers) {
        System.out.println(p);
    }
}
}