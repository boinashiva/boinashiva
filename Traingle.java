package controlstatements;

public class Traingle {

	public static void main(String[] args) {
		 // Given angles (example values)
        int angle1 = 42;
        int angle2 = 58;
        int angle3 = 80;
     // Check if the sum of angles equals 180 degrees
        if((angle1>0&&angle2>0&&angle3>0)&&(angle1 + angle2 + angle3 == 180))
        {
            System.out.println("These angles can form a triangle.");
        } 
        else {
            System.out.println("These angles cannot form a triangle.");
        }
	}
}
    
