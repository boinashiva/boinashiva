package controlstatements;

public class Greaterfive {

    public static void main(String[] args) {
        // Initializing variables with integer values
        int a = 10;
        int b = 15;
        int c = 13;
        int d = 20;
        int e = 9;
        
        // Compare variable 'a' with 'b', 'c', 'd', and 'e'
        if (a > b && a > c && a > d && a > e) {
            System.out.println("a is Greater");
        }
        // If 'a' is not the greatest, compare 'b' with 'a', 'c', 'd', and 'e'
        else if (b > a && b > c && b > d && b > e) {
            System.out.println("b is Greater");
        }
        // If 'b' is not the greatest, compare 'c' with 'a', 'b', 'd', and 'e'
        else if (c > a && c > b && c > d && c > e) {
            System.out.println("c is Greater");
        }
        // If 'c' is not the greatest, compare 'd' with 'a', 'b', 'c', and 'e'
        else if (d > a && d > b && d > c && d > e) {
            System.out.println("d is Greater");
        }
        // If none of the above conditions are true, 'e' must be the greatest
        else {
            System.out.println("e is Greater");
        }
    }
}
