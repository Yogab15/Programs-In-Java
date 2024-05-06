package forGit;

import java.util.LinkedHashMap;

public class LinkedHashmapEx 
{

	public static void main(String[] args) 
	{

		LinkedHashMap<Integer, String> lh=new LinkedHashMap<Integer, String>();    // Generic Collection
		
		lh.put(1, "Yogada");
		lh.put(11, "Pallavi");
		lh.put(17, "Manasi");
		lh.put(19, "Mili");
		lh.put(13, "Anu");
		lh.put(14, "Nivi");
		lh.put(34, "Janhavi");
		lh.put(43, "Veda");
		lh.put(null, null);      // 1 null key is accepted    
		
		lh.put(7, null);		 // multiple  null valued can allowed
		
		lh.put(9, "Yukti");     // Multiple value can allowed
		
		System.out.println(lh);

	}

}
