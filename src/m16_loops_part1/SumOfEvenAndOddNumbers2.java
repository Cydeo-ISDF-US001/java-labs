package m16_loops_part1;

public class SumOfEvenAndOddNumbers2 {

    public static void main(String[] args) {

        int sumEven = 0;
        int sumOdd = 0;

        for (int i = 0; i <= 10; i++) {

            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }

        }

        System.out.println("sum of even number " + sumEven);
        System.out.println("sum of odd number " + sumOdd);

    }

}
