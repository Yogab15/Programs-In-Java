package forGit;
 
//class Sample{
//	int x=5; // Instance variable for a class Sample 
//}
public class FstProg {
	
/*if final variable assign to instance that not possible to assign new insatance variable or we cannot modify*/
	//final int x=12;
	int x=8;  // instance variable for class FirstProg
	
	public static void main(String[] args) {
		
		FstProg fp1=new FstProg(); // FirstProg Using
		fp1.x=20; // instance variable for FirstProg object fp1 particular only
		System.out.println(fp1.x);
		
		FstProg fp2=new FstProg(); // FirstProg Using
		System.out.println(fp2.x);
		
	
		//Sample sm=new  Sample(); // Sample using
		//System.out.println(sm.x);
	}

}
