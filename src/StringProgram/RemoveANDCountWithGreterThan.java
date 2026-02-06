package StringProgram;

import java.util.HashMap;
import java.util.Set;

public class RemoveANDCountWithGreterThan {

	public static void main(String[] args) {
		String s= "nayanmadam";
		char [] a = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char charvalue:a)
		{
			if(hm.containsKey(charvalue))
			{
				hm.put(charvalue, hm.get(charvalue)+1);
			}
			else
			{
				hm.put(charvalue, 1);
			}
		}

		System.out.println(hm);
		Set<Character> ss = hm.keySet();
		for(char sss:ss)
		{
			if(hm.get(sss)>1)
			{
				System.out.println(sss+"="+hm.get(sss));
			}
		}
		System.out.println("printing greater than 2");
		for(char sss:ss)
		{
			if(hm.get(sss)>2)
			{
				System.out.println(sss+"="+hm.get(sss));
			}

		}
	}


}