package beginner;
/*
Write a Java program that converts 1000 inches to meters.
Expected output
1000.0 inch is 25.4 meters
*/
public class ConvertInchToMeter {
    public static void main(String[] args) {
        double inc = 1000.0;
        double meter = 0.0254 * inc;
        System.out.println(inc + " inch is " + meter + " meters");
    }
}