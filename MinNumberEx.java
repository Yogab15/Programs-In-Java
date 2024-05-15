package forGit;
 

public class MinNumberEx {
	
	
	public void minFunction(int n , int m) // n=a,m=b  // main function   \\ Method Start
	{
		int min;
		if(n>m)
		{
			System.out.println("The minmum vlue is " +m);
			
		}
		else
		{
			System.out.println("The minmum vlue is " +n);
		}
		
	}																		// method end

	public static void main(String[] args) {

		int a=10;
		int b=5;
		int c;
			
		MinNumberEx men=new MinNumberEx() ;
		men.minFunction(a, b); // calling function
	}

}
