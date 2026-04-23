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
        if (fuelGauge.getGallons() > 0){
            mileage ++;
            milesSinceLastFillUp++;
            if (mileage > 999999){
                mileage = 0;
            }
            if (milesSinceLastFillUp == 25){
                fuelGauge.decrementFuel();
                milesSinceLastFillUp=0;
            }
        }
    }

}
