package m13_operators_part3;

// Write a program that prints out the driving permit status of
// resident based on the given age, and if resident has
// learner’s permit and/or driver’s license.
//
// According to the Virginia State Law, in order to drive,
// a resident must be over 18 and have a driver’s license,
// or must be over 15 years and 6 months old and have a learner’s permit.

public class EligibleToDrive {

    public static void main(String[] args) {

        double age = 20.0;

        boolean hasLearningPermit = true;
        boolean hasDriverLicense = false;

        boolean result = (age >= 18 && hasDriverLicense) || (age >= 15.5 && hasLearningPermit);

        System.out.println("Is Mike eligible to drive?   " + result);


    }

}
