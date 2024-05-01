package forGit;


class Employeee
{
	public int salary; // Attribute of a Employee class
	
//	public Employee()  // No-arg constructor //
//	{
//		
//	}
	
	public Employeee(int sal)  // special type of method // constructor
	{
		salary=sal;
	}
	
	public void work()  // method of a Employee  class
	{
		System.out.println("Working as a EMPLOYEE...");
	}
	
	public int getSalary()  // method
	{
		return salary;
	}
}

  

class Managerr extends Employee
{
	public Managerr(int sal, String name)
	{
		super(name, sal);
	}
	
	public void work()
	{
		System.out.println("Managing The Employee...");
	}
	
	public void addEmployee() // Overriding the addEmployee Method
	{
		System.out.println("ADDING New Employee");
	}
}

public class EmpMainExample {

	public static void main(String[] args) {
		
		Employeee emp =new Employeee(45000);  //Create an instance of a Employee class
		
		Managerr man=new Managerr(70000, null);		// Create an instance of a Manager class
		
		emp.work();
		System.out.println("EMPLOYEE salary"+emp.getSalary());   // print employee salary
		
		man.work();
		System.out.println("Manager Salary"+man.getSalary()); // print manager salary
		
		man.addEmployee();
	}

}

