package CollectionProgram;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Set;

public class ChexkPerticularKeyValueintheMap {
	public static void main(String[] args) {

		HashMap<String, Integer> hm =new  HashMap<String, Integer>();
		hm.put("abc1", 1);
		hm.put("abc2", 2);
		hm.put("abc3", 3);
		hm.put("abc4", 4);
		System.out.println("size of map:"+hm.size()); //4 

		System.out.println("elements in hashmap");

		System.out.println(hm.remove("abc3")); // 3
	}

}
