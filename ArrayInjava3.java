package MyGit;
//Method a n array primitive type 

public class ArrayInjava3 {

	static int[] methodOne()
	{
		int[] a=new int[8];
		a[2]=15;
		a[5]=30;
		return a;
	}
	
	public static void main(String[] args) {
		
		
		
		int [] a=methodOne();
		
		System.out.println(a[2]);
		System.out.println(a[5]);
		
		
	}

}
