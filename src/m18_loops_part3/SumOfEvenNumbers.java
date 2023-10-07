package m18_loops_part3;

// Calculate the sum of even numbers between 1 and 10
// then print the result (use while loop)

public class SumOfEvenNumbers {

    public static void main(String[] args) {

//      For Loop Solution:

//        int sumEven = 0;
//
//        for (int i = 0; i <= 10; i++) {
//            if (i % 2 == 0) {
//                sumEven += i;
//            }
//        }
//        System.out.println(sumEven);

//      while Loop Solution:

        int num = 0;

        int sumEven = 0;

        while (num <= 10){

            if(num % 2 == 0){
                sumEven = sumEven + num;
            }
            num++;
        }

        System.out.println("Sum of the nums " + sumEven);


    }

}
