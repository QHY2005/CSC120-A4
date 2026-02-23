/**
 * This Passenger class represents a person who can get on and get off a Car.
 */
public class Passenger implements PassengerRequirements {
        private String name;

/**
 * This constructs a Passenger with any given name.
 * @param name is the passenger's name
 */     
public Passenger(String name) {
    this.name = name;
}

/**
 * This enables to board any given car and to print failed if failed.
 * @param Car c , which represent the Car the passenger wants to board
 */
public void boardCar(Car c) {

    Boolean success = c.addPassenger(this);

    if (!success) {
        System.out.println("Boarding failed. Car is full.");
    }
}
/**
 * This enables to get off any given car and to print failed if failed.
 * @param Car c, which represents the Car that the passenger wants to exit
 */
public void getOffCar(Car c) {

    Boolean success = c.removePassenger(this);

    if (!success) {
        System.out.println("Exit failed. Passenger not found in this car.");
    }
}

}