package forGit;
 

import java.util.Comparator;

public class EmployeeNameComperator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{

		return o1.getName().compareTo(o2.getName());  //compare to string one to another
		
	}

}

