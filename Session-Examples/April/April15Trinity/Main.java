package April.April15Trinity;

public class Main {
    public static void main(String[] Args){

    }
}

class Rainfall {
    private double[] rainfall;

    public Rainfall(double[] rainfall) {
        this.rainfall = rainfall;
    }

    public double getTotalRainfall() {

        double total = 0;

        //Calculate total rainfall
        for (int i = 0; i < rainfall.length; i++) {
            total += rainfall[i];
        }

        return total;

    }

    // Calculate average rainfall
    public double getAverageRainfall() {
        double total = getTotalRainfall();
        int length = rainfall.length;
        double average = total / length;
        return average;
    }

    /*
    i - rainfall[i]
    0 - 5
    1 - 20
    2 - 13
    3 - 40 <- current max
     */
    // Return index of month with highest rainfall
    public int getMaxMonth() {
        int maxIndex = 0; // hold the index of the highest rainfall

        for (int i = 1; i < rainfall.length; i++) {
            if (rainfall[i] > rainfall[maxIndex]){
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // TODO: Return index of month with lowest rainfall
    public int getMinMonth() {
        int minIndex = 0;

        // Hint: for (int i = 1; i < rainfall.length; i++) {
        // Refer to getMaxMonth Hint...
        // }

        return minIndex;    }
}