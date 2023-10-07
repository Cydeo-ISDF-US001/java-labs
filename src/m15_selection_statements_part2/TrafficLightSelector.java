 package m15_selection_statements_part2;

// Write a program using switch statement to
// display traffic light colors using following logic:
// 'R' or 'r' -> "Red"
// 'Y' or 'y' -> “Yellow"
// 'G' or 'g' -> "Green"

public class TrafficLightSelector {

    public static void main(String[] args) {

        String lightColor = "x";
        
        switch (lightColor) {

            default:
                System.out.println("Invalid Color");
                break;
            case "R":
            case "r":
                System.out.println("Red");
                break;
            case "Y":
            case "y":
                System.out.println("Yellow");
                break;
            case "G":
            case "g":
                System.out.println("Green");
                break;


        }

    }

}