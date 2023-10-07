package m14_selection_statements_part1;

// Write a program that calculates the average of Math, Chemistry,
// and Biology scores and prints the grade table.

// 90 - 100 -> A    80 - 89 -> B    70 - 79 -> C
// 60 - 69 -> D     0 - 59 -> F

public class Grade {

    public static void main(String[] args) {

        double math = 60.0;
        double chemistry = 50.0;
        double biology = 70.0;

        double average = (math + chemistry + biology) / 3;

        if (average >= 90 && average <= 100) {
            System.out.println("Average is " + average);
            System.out.println("Grade is A");
        } else if (average >= 80 && average < 90) {
            System.out.println("Average is " + average);
            System.out.println("Grade is B");
        } else if (average >= 70 && average < 80) {
            System.out.println("Average is " + average);
            System.out.println("Grade is C");
        } else if (average >= 60 && average < 70) {
            System.out.println("Average is " + average);
            System.out.println("Grade is D");
        } else if (average >= 0 && average < 60) {
            System.out.println("Average is " + average);
            System.out.println("Grade is F");
        } else {
            System.out.println("Invalid Average/Grade");
        }

    }

}
