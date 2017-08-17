package employee;

public class abccompany {

//Initializing class variables 

	String company_name="Cerner";
	String company_location="Bangalore";

//Some instance variables like employee_id and Employee_designation need to be private so that they can only be access through getters and setters.

    private	int employee_id;
    
    private String Employee_designation;
    
  

	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
    // public method to calculate the salary of the employee according to its designation

	public void calculate_totalSalary(double basicSalary,String Employee_designation){
		if(Employee_designation.equals("Manager")||Employee_designation.equals("manager")){
			double total_salary=(basicSalary+(0.15*basicSalary));
			System.out.println(total_salary);
		}
		else if(Employee_designation.equals("Trainee")||Employee_designation.equals("trainee")){
			double total_salary=(basicSalary+(0.10*basicSalary));
			System.out.println(total_salary);
		}
		else{
			System.out.println("Designation does not match");
		}
		
		
	}
	public String getEmployee_designation() {
		return Employee_designation;
	}
	public void setEmployee_designation(String Employee_designation) {
		this.Employee_designation = Employee_designation;
	}
    
}
