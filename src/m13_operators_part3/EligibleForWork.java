package m13_operators_part3;

// Print out the eligibility of work for a given resident’s birth year.
//
// If the age is between 18 and 65 (inclusive), then the output should be "true".

public class EligibleForWork {

    public static void main(String[] args) {

        int age = 72;

        boolean isEligible = age >= 18 && age <= 65;

        System.out.println("Am i eligible to work?  "  + isEligible);


    }

}
