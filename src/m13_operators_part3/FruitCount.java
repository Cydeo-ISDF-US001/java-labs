package m13_operators_part3;

// Declare three "int" variables, "appleCount", "orangeCount" and "strawberryCount".
// Write an expression that evaluates if the number of apples is less than the number of oranges
// or the number of oranges is greater than or equal to the number of strawberries
// and assign the result of it to "result" variable then print it.

public class FruitCount {

    public static void main(String[] args) {

        int appleCount = 5;
        int orangeCount = 6;
        int strawberryCount = 12;

        boolean result = appleCount < orangeCount || orangeCount >= strawberryCount;

        System.out.println("result = " + result);

    }

}
