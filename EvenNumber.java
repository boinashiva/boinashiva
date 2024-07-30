package virat;

import java.util.Scanner;

public class EvenNumber {

    public static void main(String[] args) {
        
        // Declare an array to hold 10 integers
        int[] numbers;
        numbers = new int[10];
        int index;
        
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter 10 numbers
        System.out.println("Enter any 10 numbers:");
        
        // Loop to read 10 numbers from the user and store them in the array
        for(index = 0; index < numbers.length; index++) {
            numbers[index] = sc.nextInt();
        }
        
        // Separator line
        System.out.println("-------------------");
        
        // Print the entered numbers
        System.out.println("Numbers are:");
        for(index = 0; index < numbers.length; index++) {
            System.out.println(numbers[index] + ",");
        }
        
        // Separator line
        System.out.println("\n------------");
        
        // Print the even numbers
        System.out.println("Even numbers are:");
        for(index = 0; index < numbers.length; index++) {
            // Check if the number is even
            if(numbers[index] % 2 == 0) {
                System.out.println(numbers[index] + ",");
            }
        }
        
    }
}
