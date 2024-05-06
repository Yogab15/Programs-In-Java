package forGit;



//java Inner Classes

//nested class --  a class within a class
//purpose is group classes that belong together ,  which make code more readable and maintainable

class OuterClass
{
	int x=10;
	
	 class InnerClass
	{
		int y=5;
		
	}

}


public class InnerMainEx 
{

	
	
	public static void main(String[] args) 
	{
		
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();

		
		System.out.println(outer.x);
		System.out.println(inner.y );
		
		System.out.println(inner.y + outer.x );
		
	}

}
