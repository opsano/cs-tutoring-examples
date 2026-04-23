package April.April22Trinity;

public class Main {
    public static void main(String[] Args){



        // objects
        FuelGauge fuelGauge = new FuelGauge();
        Odometer odometer = new Odometer(0, fuelGauge);


        System.out.println("Filling up with gas");
        // TODO: Fill the tank to 15 gallons (Hint: while loop)
        // Display each gallon added
        System.out.println();
        System.out.printf("%-15s %-12s %-15s%n", "Miles Driven", "Gas Used", "Gas Remaining");
        System.out.println("------------------------------------------------");
        int gasUsed = 0;
        // TODO:
        // Simulate driving until the tank is empty
        // Hint: while (fuelGauge.getGallons() > 0)
        // Print output every 25 miles (Hint: for loop)
        // At 1 gallon remaining, print "Time to get gas!"
        // When empty, print final message

        // examples of getters and setters
        getterAndSetter mygetterAndSetter = new getterAndSetter();
        mygetterAndSetter.setMyInt(5);
        System.out.println(mygetterAndSetter.getMyInt());
    }
}
