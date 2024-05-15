package forGit;
 
//using equals ()method
public class StringEx {

	
		//Concat 2 strings
	
	public static void main(String[] args) {
		
		//Concat 2 strings
		
		String name1="Yoga";
		String name2="B";
		String name3=name1.concat(name2);
		
		System.out.println(name3);
		
		String name4="Yoga";
		String name5="B";
		String name6=name1.concat(name5);
		
		System.out.println(name6);

		
		String s="Hell";
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s2));
		
		
	}

}
