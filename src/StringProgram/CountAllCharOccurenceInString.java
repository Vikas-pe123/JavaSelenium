package StringProgram;

import java.util.HashMap;

public class CountAllCharOccurenceInString {
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
	System.out.println("counting of each char avialble in string "+hm);
}
}
