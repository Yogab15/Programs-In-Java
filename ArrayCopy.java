package MyGit; 
public class ArrayCopy {

	public static void main(String[] args) {
		
		int[] a= {12,21,7,11,51};
		
		int [] b = new int [a.length];
		
		System.arraycopy(a, 0, b, 0, a.length); // system class  method
		
		for(int i=0; i<b.length;i++) 
		{
			System.out.println(b[i]);	
		}

		
	}

}
