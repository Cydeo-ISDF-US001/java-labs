package m15_selection_statements_part2;

// Write a program using switch statement that displays different messages
// for given laptop models like “apple”, “dell”, or “hp” laptop models as below:
// If it is "apple", display "Apple-no virus"
// If it is "dell", display "Tough one"
// If it is "hp", display "Not recommended"
// Else show "Do not buy that one!"

public class LaptopModel {

    public static void main(String[] args) {

        String laptopModel = "Sony";

        switch (laptopModel) {

            case "apple":
                System.out.println("Apple - no virus");
                break;
            case "dell":
                System.out.println("Tough one");
                break;
            case "hp":
                System.out.println("not recommended");
                break;
            default:
                System.out.println("Do not buy that one!");
                break;
        }




    }

}