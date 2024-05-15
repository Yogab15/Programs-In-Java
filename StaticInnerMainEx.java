package forGit;
 

class OuterClass1
{
	int x=10;
	
	static class InnerClass
	{
		int y=20;
	}
}


public class StaticInnerMainEx  {

	public static void main(String[] args) {
		
		OuterClass1.InnerClass inner=new OuterClass1.InnerClass();

		System.out.println();	
		
		System.out.println(inner.y);
	}

}
