/**
 * The Engine class represents the locomotive engine of a Train.
 * It stores information about the type of fuel used, the current fuel level, and the maximum fuel capacity. 
 * The Engine is setted for consuming fuel as train able to run, refueling train if needed and print some useful information.
 */
public class Engine implements EngineRequirements {
private FuelType fuelType;
private double currentFuel;
private double maxFuel;

/**
 * This Constructs an Engine with a specified fuel type, initial fuel level, and maximum fuel capacity.
 *
 * @param fuelType shows the type of fuel used by this engine
 * @param currentFuel shows the initial amount of fuel
 * @param maxFuel shows the maximum fuel capacity
 */
public Engine(FuelType fuelType, double currentFuel, double maxFuel) {
    this.fuelType = fuelType;
    this.currentFuel = currentFuel;
    this.maxFuel = maxFuel;
}
/**
 * This returns the fuel type of the engine.
 */
public FuelType getFuelType() {
    return fuelType;
}

/**
 * This returns the maximum fuel capacity of the engine.
 */
public double getMaxFuel() {
    return maxFuel;
}

/**
 * This returns current fuel level of the engine.
 */
public double getCurrentFuel(){
    return currentFuel;
}

/**
 * This refuels the engine and made the current fuel level to the maximum capacity of the engine.
 */
public void refuel(){
    currentFuel = maxFuel;
}

/**
 * This decreases the current fuel level by one unit to run once if there's enough fuel.
 * Prints the remaining fuel level.
 *
 * It will return true if the engine still has fuel remaining after running,
 * It will return false if the engine is out of fuel
 */
public Boolean go() {
    if (currentFuel <= 0){
        return false;
    }
    currentFuel = currentFuel - 1;
    System.out.println("Fuel remaining:" + currentFuel);
    return true;
}


public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 0.0, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }
}


