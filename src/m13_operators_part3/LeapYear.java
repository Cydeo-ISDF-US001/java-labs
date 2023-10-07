package m13_operators_part3;

// Write a program checking whether a year is a leap year or not.
//
// A leap year is defined as a year that is divisible by 4,
// except for years that are divisible by 100.
// However, years that are divisible by 400 are considered leap years.

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.println("Is " + year + " a leap year? " + isLeapYear);

    }

}
