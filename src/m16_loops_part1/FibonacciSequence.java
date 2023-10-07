package m16_loops_part1;

// Write a program that generates and prints the Fibonacci series
// up to a specified number of termsu

// The Fibonacci series is a sequence of numbers where each number
// is the sum of the two preceding ones. It starts with 0 and 1,
// and each subsequent number is the sum of the two previous numbers.
// The series continues indefinitely.

// Example input: 9
// Output: 0 1 1 2 3 5 8 13 21

public class FibonacciSequence {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 1;
        int sum = 0;

       for (int i = 1; i <= 9; i++) {

           //print the num1
           System.out.print(num1 + " ");

           //compute the next numbers in the series
           sum = num1 + num2;
           num1 = num2;
           num2 = sum;

       }

    }

}
