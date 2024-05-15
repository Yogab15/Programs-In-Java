package forGit;


class SuperParent
{
	String name;


	public void details()
	{
		name="Parent";
		System.out.println(name);
	}
}
public class ParentSuperDemo extends SuperParent {

	String name;
	
	public void details()
	{
		super.details();
		name="Child";
		System.out.println(name);
		
	}
	
	public static void main(String[] args) {
		
		ParentSuperDemo obj=new ParentSuperDemo();
		
		obj.details();

	}

}
