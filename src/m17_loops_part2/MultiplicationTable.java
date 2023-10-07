package m17_loops_part2;

// Write a program that prints the multiplication table as shown below:

// 1 * 0 = 0	1 * 1 = 1	1 * 2 = 2	....    1 * 8 = 8	1 * 9 = 9
// 2 * 0 = 0	2 * 1 = 2	2 * 2 = 4	....	2 * 8 = 16	2 * 9 = 18
// 3 * 0 = 0	3 * 1 = 3	3 * 2 = 6	....	3 * 8 = 24	3 * 9 = 27
// .....
// 9 * 0 = 0	9 * 1 = 9	9 * 2 = 18	....	9 * 8 = 72	9 * 9 = 81

public class MultiplicationTable {

    public static void main(String[] args) {


        for (int num1 = 1; num1 <= 9; num1++) {

            for (int num2 = 0; num2 <= 9; num2++) {

                System.out.print(num1 + " * " + num2 + " = " + (num1 * num2));
                System.out.print("\t");

            }

            System.out.println();

        }

    }

}
