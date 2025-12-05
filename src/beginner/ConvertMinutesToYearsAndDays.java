package beginner;
/*
Write a Java program to convert 3456789 minutes into years and days.
Expected output
3456789 minutes is approximately 6 years and 210 days
*/
public class ConvertMinutesToYearsAndDays {
    public static void main(String[] args) {
        int min = 3456789;
        int minutesInYear = 60 * 24 * 365;
        int minutesInDay = 60 * 24;
        int years = min / minutesInYear;
        int days = (min / minutesInDay) % 365;
        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days");
    }
}


