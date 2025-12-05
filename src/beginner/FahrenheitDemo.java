package beginner;

/*
Write a Java program to convert temperature from 212 Fahrenheit to Celsius degrees.
Expected output
212.0 degree Fahrenheit is equal to 100.0 in Celsius/
*/
public class FahrenheitDemo {
    public static void main(String[] args) {
        double fahrenheit = 212.0;
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celcius");
    }
}