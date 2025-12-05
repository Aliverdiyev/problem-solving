package operators;

public class Quiz23 {
    //    What is the output of the following code snippet?
    public static void main(String[] args) {
        boolean sunny = true, raining = false, sunday = true;
        boolean goingToTheStore = sunny & raining ^ sunday;
        boolean goingToTheZoo = sunday && !raining;
        boolean stayingHome = !(goingToTheStore && goingToTheZoo);
        System.out.println(goingToTheStore + " - " + goingToTheZoo + " - " + stayingHome);  //true - true - false
    }
}
