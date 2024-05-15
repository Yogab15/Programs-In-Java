package forGit;
 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MapExample
{

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(3,"YOGADA");
		
		HashMap hm=new HashMap();
		m.put(13, "Mili");
		m.put(20, "Anushri");
		m.put(14, "Manasi");
		m.put(9, "Veda");
		m.put(11, "Shiv");
		
		HashSet set=new HashSet();
		set.add("YOGADA");
		
		
		System.out.println(m.get(13));
		
		System.out.println(m.remove(9));
		
		System.out.println(m.containsKey(20));
		
		System.out.println(m.size());
		
		System.out.println(m.values());
		
		System.out.println(m);
		
		System.out.println(set);
		

	}

}
