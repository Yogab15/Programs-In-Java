package forGit;

 

public class ThisCLass1 {
	
	int a;  // instance variable
	int b;
	
	ThisCLass1() // default Constructor
	{
		this.a=30;   // refrence variable
		this.b=40;
	}
	
	public ThisCLass1 get()
	{
		
		return this;
			
	}
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {

		ThisCLass1 ts1 =new ThisCLass1();  // Create instance of a object ThisClass1
		System.out.println(ts1.get()); 
		//ts1.display();
		ts1.get().display();
	}

}
