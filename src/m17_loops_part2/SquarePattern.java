package m17_loops_part2;

// Write a program that prints the square pattern which has the
// same number of stars and number of rows with any given number.

// Example input: 6
// Output:
// *  *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *  *
// *  *  *  *  *  *

public class SquarePattern {

    public static void main(String[] args) {

        int givenNum = 6 ;

        //control the row
        for (int i = 1; i <= givenNum; i++){

            //stars
            for(int j = 1; j <= givenNum; j++){
                System.out.print("*  ");
            }

            System.out.println();

        }



    }

}
