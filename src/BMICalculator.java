/**
 * @class: BMICalculator
 * @author: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 6, 2023
 * @description: In this program the script prompts the user to enter his/her weight in pounds and his/her height in inches. the program
  then calculates the bmi using the formula: BMI = Weight(kilograms)/(height(meters))2.
 */

import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
// When prompted you will enter weight in pounds
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();
// When prompted you will enter the height in inches
        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();
// Equation to convert pounds to weight in kg
        double weightInKg = weightInPounds * 0.4536;
// Equation to convert height in inches to height in meters
        double heightInMeters = heightInInches * 0.0254;
// Equation to find the bmi
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is equal to: " + bmi);
// These boolean values are used to determine whether one's weight is Underweight, Normal weight, Overweight, Obese
        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
