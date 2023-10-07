package m11_operators_part1;

// Write a program that swap the values of variables "int num1" and "int num2"

public class SwapValues {

    public static void main(String[] args) {

        // By using Temporary Variable

//        int num1 = 10;
//        int num2 = 7;
//
//        int temp;
//
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);

        // Without using Temporary Variable

        int num1 = 10;
        int num2 = 7;

        num2 = num2 + num1;
        num1 = num2 - num1;
        num2 = num2 - num1;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

    }

}
