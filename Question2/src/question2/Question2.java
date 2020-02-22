// Pauline Chicoye, Programming 1
// a program that calculates the BMI of a person
package question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        //Ask the user their height
        Scanner objHeight = new Scanner(System.in);
        System.out.println("Please input your height in feet");
        double heightFeet = objHeight.nextDouble();
        
        //Ask the user their weight
        Scanner objWeight = new Scanner(System.in);
        System.out.println("Please input your weight in pounds");
        int weightPounds = objWeight.nextInt();
        
        //constants
        final double CONVERT_KILO = 0.453;
        final double CONVERT_METERS = 0.305;
        
        //Transformation
        double heightMet = heightFeet * CONVERT_METERS;
        double weightKil = weightPounds * CONVERT_KILO;
        
        double bmi = weightKil / (heightMet * heightMet);
        
        System.out.println("The calculated BMI is " + bmi);
        
        
    }
    
}
