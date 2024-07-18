package controlstatements;

public class Simpleinterst {

	public static void main(String[] args) {
        // Given values
        int principal = 50000; // Principal amount
        int rate = 5; // Annual interest rate (in percentage)
        int time = 3; // Time duration in years

        // Calculate simple interest
        int simpleInterest = (principal * rate * time) / 100;

        // Output the calculated simple interest
        System.out.println("Principal amount: RS"+principal );
        System.out.println("Annual interest rate: " + rate + "%");
        System.out.println("Time duration: " + time +"years");
        System.out.println("Simple Interest = RS" + simpleInterest);
    }

}
