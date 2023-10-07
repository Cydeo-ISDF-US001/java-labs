package m16_loops_part1;

// Print the odd numbers which starts from 1 (inclusive) and ends at 19 (inclusive)
// in the same line with a dash between the numbers.
// Output: 1-3-5-7-9-11-13-15-17-19

public class OddNumbers {

    public static void main(String[] args) {

        System.out.print(1);

        for (int i = 3; i <= 19; i+=2) {

            System.out.print("-" + i);

        }

    }

}
