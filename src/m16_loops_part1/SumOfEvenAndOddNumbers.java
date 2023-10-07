package m16_loops_part1;

// Calculate the sum of even and odd numbers between 1 and 10 (exclusive)
// then print the result as below

public class SumOfEvenAndOddNumbers {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        //sum of even
        for (int i = 0; i <= 10; i += 2) {
            sumEven += i;
        }

        //sum of odd
        for (int i = 1; i <= 10; i += 2) {

            sumOdd += i;

        }

        System.out.println("sum of even number " + sumEven);
        System.out.println("sum of odd number " + sumOdd);


    }

}
