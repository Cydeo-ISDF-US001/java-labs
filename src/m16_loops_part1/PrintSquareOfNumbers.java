package m16_loops_part1;

// Print the square of numbers which starts from 1 and ends at 10 as below:
//  num |	num^2
//  --------------
//  1	|	1
//  2	|	4
//  3	|	9
//  4	|	16
//  5	|	25
//  6	|	36
//  7	|	49
//  8	|	64
//  9	|	81
//  10	|	100

public class PrintSquareOfNumbers {

    public static void main(String[] args) {

        System.out.println("num\t|\tnum^2");
        System.out.println("--------------");

        for (int number = 1; number <= 10; number++) {

            System.out.println(number + "\t|\t" + (number * number));

        }

    }

}
