package April.April22Trinity;

public class Main {
    public static void main(String[] Args){
        // objects
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(0, fuelGauge);

        System.out.println("Filling up with gas");
        // Fill the tank to 15 gallons (Hint: while loop)
        while (fuelGauge.getGallons() < 15){
            fuelGauge.incrementFuel();
        }
        // Display each gallon added
        System.out.println();
        System.out.printf("%-15s %-12s %-15s%n", "Miles Driven", "Gas Used", "Gas Remaining");
        System.out.println("------------------------------------------------");
        int gasUsed = 0;
        while(fuelGauge.getGallons() > 0){ // if our current number of gallons is greater than zero, drive
            for (int i = 0; i < 25; i++){
                odometer.incrementMileage();
            }
            System.out.println(odometer.getMileage()); // you will have to print the other stuff
            if (fuelGauge.getGallons() == 1){
                System.out.println("Time to get gas!");
            }
            else if(fuelGauge.getGallons() == 0){
                System.out.println("We ran out!");
            }
            /*
            modulus way of doing this
            if (odometer.getMileage() % 25 == 0){
                System.out.println(odometer.getMileage());// you figure out the print lines
            }*/
        }
    }
}
