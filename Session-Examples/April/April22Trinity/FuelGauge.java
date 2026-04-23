package April.April22Trinity;

public class FuelGauge {
    private int gallons;
    private final int MAX_FUEL = 15;
    public FuelGauge() {
        gallons = 0;
    }
    public int getGallons() {
        return gallons;
    }
    public void incrementFuel() {
        // Add 1 gallon only if the tank is not full
        if (gallons < MAX_FUEL){
            gallons++;
        }
        else{
            System.out.println("Fuel at Max Capacity!");
        }
    }
    public void decrementFuel() {
        // Remove 1 gallon only if there is fuel left
        if (gallons > 0) {
            gallons--;
        }
        else{
            System.out.println("Fuel Empty!");
        }
    }
}
