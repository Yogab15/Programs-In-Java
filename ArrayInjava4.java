package MyGit; 
class AB
{
	int i;
}

public class ArrayInjava4 {

	static AB[] methodOne()
	{
		AB[] a=new AB[8];
		
		a[2]=new AB();
		a[6]=new AB();
		a[2].i=10;
		a[6].i=20;
		return a;
		
	}
	
	public static void main(String[] args) {
		
		AB[] a = methodOne();
		System.out.println(a[2]);
		System.out.println(a[6]);
	}

}
