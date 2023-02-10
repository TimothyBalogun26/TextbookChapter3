/**
 * @class: TriangleCalculator
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: February 6, 2023
 * @description: The program calculates the perimeter of the triangle if the input is valid, otherwise it prints invalid input.
   The input is valid if the sum of every pair of two edges is greater than the remaining edge.
 */

import java.util.Scanner;
public class TriangleCalculator {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the first edge of the triangle: ");
        // Prompts users to input the measures of edge: A,B, and C
        int edgeA = scanner.nextInt();

        System.out.print("Enter the length of the second edge of the triangle: ");
        int edgeB = scanner.nextInt();

        System.out.print("Enter the length of the third edge triangle: ");
        int edgeC = scanner.nextInt();
        // This is a boolean evaluation to determine if the statement below is correct or not
        if ((edgeA + edgeB > edgeC) && (edgeB + edgeC > edgeA) && (edgeA + edgeC > edgeB)) {
            // This is the equation to find the perimeter of the edges
            int perimeterOfTriangle = edgeA + edgeB + edgeC;
            System.out.println("The perimeter of the triangle is equal to: " + perimeterOfTriangle);}
        // If the boolean value above is incorrect the user will then be prompted with the value below
        else {
            System.out.println("Invalid input");
        }
    }
}
