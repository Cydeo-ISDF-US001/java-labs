package m16_loops_part1;

// Print the even numbers which starts from 0 (exclusive) and ends at 10 (inclusive)
// in the same line with a space between the numbers.
// Output: 2 4 6 8 10

public class EvenNumbers {

    public static void main(String[] args) {

        for (int i = 1; i <=10; i++){
            if (i % 2 == 0){
                System.out.println(i + " ");
            }
        }


    }

}
