package MyGit;
 
public class DemoBitwise {

	public static void main(String[] args) {
		int m=60;
		int n=13;
		int result;
		result=m & n;
		
		System.out.println(result);
		
		result=m | n;
		System.out.println(result);
		
		result=m ^ n;
		System.out.println(result);
		
		result=m & n;
		System.out.println(result);
		
		result=m >> 2; // 15
		System.out.println("m >> 2" + result);
		
		result=m << 2; // 15
		System.out.println("m << 2" + result);
		

	}

}
