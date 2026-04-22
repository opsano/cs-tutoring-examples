package April.April22Trinity;

public class Odometer {
    private int mileage;
    private FuelGauge fuelGauge;
    private int milesSinceLastFillUp;
    public Odometer(int mileage, FuelGauge fuelGauge) {
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
        this.milesSinceLastFillUp = 0;
    }
    public int getMileage() {
        return mileage;
    }
    public void incrementMileage() {
    /* TODO:
    // if (fuelGauge.getGallons() > 0) {
    // 1. Increase mileage by 1
    // 2. Reset to 0 if mileage exceeds 999999 (Hint: if)
    // 3. Track miles since last gallon used (Hint: increment milesSinceLastFillUp)
    // 4. Every 25 miles, decrease fuel by 1 gallon
    // Hint: if (milesSinceLastFillUp == 25) {
                fuelGauge.decrementFuel();
                milesSinceLastFillUp = 0
             }
     */
    }

}
