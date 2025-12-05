package beginner;
/*
Write a Java program compute the body mass index(BMI) for weight 452 pounds and height 72 inches
Expected Output:
Body Mass Index is 61.30159143458721
 */
public class BodyMassIndex {
    public static void main(String[] args) {
        double weight = 452;
        double height = 72;
        double bmi = (weight / (height * height)) * 703;
        System.out.println("Body Mass Index is " + bmi);
    }
}