package MyGit; 
public class CheckImmutable 
{


	public static void main(String[] args) 
	{
		String s1 = "YOGADA";
		String s2 = "YOGADA";
		
		System.out.println(s1 == s2); 
		
		
		System.out.println(s1.concat("YOGADA"));
		System.out.println(s1);
		
		
		  String s11 = new String("YOGADA");
		  
		  System.out.println(s11); //Output : JAVA
		  
		  s11.concat("YOGADA");
		  
		  System.out.println(s11); //Output : JAVA
	}

}
