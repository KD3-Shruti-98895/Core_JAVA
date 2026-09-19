import java.util.Scanner;


class person {
	private String name;
	private int age;
	
	Scanner sc = new Scanner(System.in);
	
	public person( ) {
		name = "";
		age = 0;
	}


	public void acceptRecord( ) {
		System.out.println("Enter name: ");
		this.name  = sc.next();
		System.out.println("Enter age: ");
		this.age = sc.nextInt();
	}
	
	public void displayRecord() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

class employee extends person{
	private int id;
	private double salary;
	
	void employee( ) {
	   id = 0;
	   salary = 0.0;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		super.acceptRecord();
		System.out.println("Enter id: ");
		this.id = sc.nextInt();
		System.out.println("Enter salary: ");
		this.salary = sc.nextDouble();
	}
	
	public void displayRecord() {
		super.displayRecord();
		System.out.println("Id: " + id);
		System.out.println("Salary: " + salary);
	}
	
	
}
public class demo_1 {
	public static void main(String [] args) {
		person p = new employee(); // upcasting 
		p.acceptRecord();
		p.displayRecord();
		employee e = (employee) p; // downcasting
		e.acceptRecord();
		e.displayRecord();
	}

}
