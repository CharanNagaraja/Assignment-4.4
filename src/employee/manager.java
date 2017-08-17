package employee;

import java.util.Scanner;

public class manager extends abccompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Scanner to take input from the user
		Scanner scanner=new Scanner(System.in);
		System.out.println(" Enter the designation of the Employee");
		String Designation=scanner.nextLine();
		System.out.println(" Enter the basic salary of the "+Designation);
		double salary=scanner.nextDouble();
		System.out.println("Enter the Employee ID ");
		int id=scanner.nextInt();

//Initializing the object of the XYZCompany 

		abccompany obj1=new abccompany();
		obj1.setEmployee_designation(Designation);
		obj1.setEmployee_id(id);
		System.out.println("The total salary of the employee with ID "+obj1.getEmployee_id()+" is ");

//calling the calclate_salary methid of xyzcompany throught the object reference

		obj1.calculate_totalSalary(salary, Designation);
		scanner.close();
	}
	
}
