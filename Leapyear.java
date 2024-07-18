package controlstatements;

public class Leapyear {

    public static void main(String[] args) {
        int a = 20; // Example year to check
        
        // Check if 'a' is a leap year
        if (a % 4 == 0 || a % 100 == 0 || a % 400 == 0) {
            System.out.println(a + " is a leap year");
        } else {
            System.out.println(a + " is not a leap year");
        }
    }

}
