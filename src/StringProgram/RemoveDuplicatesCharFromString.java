package StringProgram;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicatesCharFromString {
	public static void main(String[] args) {
		String s= "nayan";
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
			System.out.println("char remove from string is :"+sss);
		}
		}
		System.out.println("*****************");
		
		
		
		
		// Alternative Way

		String x="nayan";
		String y="";
		for(int i=0; i<x.length(); i++)
{
			
boolean found =false;
for(int j=0; j<y.length(); j++)
{
if(x.charAt(i)==y.charAt(j))
{
	found =true;
	break;

}
}
if(found==false)
{
y=y+x.charAt(i);	
}
}
		System.out.println(y);
}

}
