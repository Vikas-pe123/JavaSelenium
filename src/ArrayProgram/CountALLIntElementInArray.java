package ArrayProgram;

import java.util.HashMap;
import java.util.Set;

public class CountALLIntElementInArray {

	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,9,9,9,1,9};
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int ar:a)
		{
			if(hm.containsKey(ar))
			{
				hm.put(ar, hm.get(ar)+1);
			}
			else
			{

				hm.put(ar, 1);
			}

		}
		System.out.println(hm);

		Set<Integer> ss = hm.keySet();
		for(int sss:ss)
		{
			if(hm.get(sss)>3)
			{
				System.out.print(sss+" ");
			}
		}
	}
}
