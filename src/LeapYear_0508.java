import java.util.Scanner;

public class LeapYear_0508 {
    public static void main(String[] args) {


        // leap year: 1976, 1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020 és 2024
        // not leap year: 1700, 1800, 1900, 2100, 2200 és 2300
        // BUT leap year:  1600, 2000 és 2400


        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        int leapYearInput = scanner.nextInt();

        if ((leapYearInput % 4 == 0) && leapYearInput % 100 != 0)
        {
            System.out.println(leapYearInput + " is a leap year.");
        }
        else if ((leapYearInput % 4 == 0) && (leapYearInput % 100 == 0) && (leapYearInput % 400 == 0))
        {
            System.out.println(leapYearInput + " is a leap year.");
        }
        else
        {
            System.out.println(leapYearInput + " is not a leap year.");
        }
    }
}
