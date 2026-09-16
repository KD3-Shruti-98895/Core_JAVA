import java.util.Scanner;
public class Q2 {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		System.out.print("Enter two numbers: ");
		 if (!sc.hasNextDouble()) {
	            System.out.println("Error: Invalid input");
	            System.exit(0);
	        }
		 num1 = sc.nextDouble();
		 num2 = sc.nextDouble();
		double avg = (num1 + num2)/2.0;
		System.out.println("Average: " + avg);
	}

}
