import java.util.Scanner;

public class Q3 {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int op, quantity;
		double totalBill = 0.0;
		int dosa = 120;
		int samosa = 60;
		int idli = 80;
		int vada_pav = 40;
	
	    do {
	     	System.out.println("MENU  ");
			System.out.println("1.Dosa               120");
			System.out.println("2.Samosa             60  ");
			System.out.println("3.Idli               80  ");
			System.out.println("4.Vada-Pav           40  ");
			System.out.println("5.Generate Total Bill ");
		
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Enter quantity for Dosa: ");
				quantity = sc.nextInt();
				totalBill += dosa  * quantity;
			break;
			case 2: 
				System.out.println("Enter quantity for Samosa: ");
				quantity = sc.nextInt();
				totalBill += samosa * quantity;
			break;
			case 3: 
				System.out.println("Enter quantity for Idli: ");
				quantity = sc.nextInt();
				totalBill += idli * quantity;
			break;
			case 4:
				System.out.println("Enter quantity for Vada-Pav: ");
				quantity = sc.nextInt();
				totalBill += vada_pav * quantity;
			break;
			case 5:
				System.out.println("\n--------------------");
                System.out.println("Total Bill Amount: ₹" + totalBill);
                System.out.println("Thank you for your order!");
                System.out.println("--------------------");
                break;
				
			}
			
	    }while(op != 5);
		
	}
}
