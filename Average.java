package array;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        // Declare an array to hold 10 integers
        int[] marks = new int[10];
        // Variable to hold the sum of the numbers
        int sum = 0;
        // Variable to hold the average of the numbers
        float avg;
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 10 numbers (marks):");
        
        // Loop to read 10 integers from the user
        for (int index = 0; index < marks.length; index++) {
            marks[index] = sc.nextInt();
        }
        
        System.out.println("-----------------------------");
        System.out.println("Entered numbers:");
        
        // Loop to print the entered numbers
        for (int index = 0; index < marks.length; index++) {
            System.out.print(marks[index] + ", ");
        }
        
        System.out.println("\n-----------------------------");
        
        // Loop to calculate the sum of the entered numbers
        for (int index = 0; index < marks.length; index++) {
            sum += marks[index];
        }
        
        // Print the sum of the entered numbers
        System.out.println("Sum of the entered numbers: " + sum);
        
        // Calculate the average by dividing the sum by the number of entries
        avg = (float) sum / marks.length;
        
        // Print the average of the numbers
        System.out.println("The average of the students' marks: " + avg);
        
        
    }
}
