package forGit;


/* OOPs Concepts 
 * Encapsulation
 * 
 * 
*/
 
class Student
{
	int id;
	String name;
	String address;
	String email;
	
	
	void display()
	{
		System.out.println(id+" "+name+" "+address+" "+email);
	}
}



public class EncapsulationEx {

	public static void main(String[] args) {
		
	Student st1=new Student();
	
	st1.id=1;
	st1.name="YB";
	st1.address="Pune";
	st1.email="Yoga@gmail.com";
	
	}

}
