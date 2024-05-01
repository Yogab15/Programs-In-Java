package forGit;

import java.util.ArrayList;
import java.util.Collections;



public class Empcomperator
{

	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(4, "Yogada", 98765);  // object of employee class
		Employee emp2 = new Employee(3, "Gauri", 90543);
		Employee emp3 = new Employee(6, "Riya", 99567);
	
		ArrayList<Employee> emplist=new ArrayList<Employee>();
		
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
	
		System.out.println("Before sorting");
		System.out.println(emplist);
		
		
//		EmployeeIdComprator id=new EmployeeIdComprator();
//		
//		Collections.sort(emplist ,id);
//		
//		
//		EmployeeSalaryComparator sal=new EmployeeSalaryComparator();  // create a object of a EmployeeSalaryComparator
//		
//		Collections.sort(emplist , sal);   // sort a list by salary of  employee
//		
		
		EmpNamecomparator nam=new EmpNameomparator();
		
		Collections.sort(emplist ,nam);
		
		
		System.out.println("After sorting");	
		System.out.println(emplist);
	}

	
}
