package ArrayProgram;

import java.util.HashMap;
import java.util.Set;

public class RemoveDuplicateStringFromArray {
	public static void main(String[] args) {

		String [] s = {"abc", "def", "abc"};
		HashMap<String, Integer> hm = new HashMap<String , Integer>();
		for(String str:s)
		{
			if(hm.containsKey(str))
			{
				hm.put(str, hm.get(str)+1);
			}
			else
			{
				hm.put(str, 1);
			}
		}
		System.out.println(hm);
		Set<String> ss= hm.keySet();
		for(String sss:ss)
		{
			if(hm.get(sss)>1)
			{
				System.out.println(sss+"="+hm.get(sss));

			}
		}

	}
}
