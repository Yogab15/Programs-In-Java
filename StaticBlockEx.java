package forGit;
 

class StaticBlockEx  {

	static int staticVariable;
	
	static
	{
		System.out.println("Static component SIB ");
		staticVariable=10;
		
	}
	static void staticMethod()
	{
		System.out.println("From static Method");
		System.out.println("staticVariable");
		System.out.println(staticVariable);
	}
	
	public class MainClassStatic{
		
		static
		{
			System.out.println("Main class SIB");
			
		}
	
	}
	public static void main(String[] args) {
		
		StaticBlockEx.staticVariable=20;
		StaticBlockEx.staticMethod();
		
		

	}

}
