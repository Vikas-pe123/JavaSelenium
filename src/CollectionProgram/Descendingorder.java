package CollectionProgram;

import java.util.TreeSet;

public class Descendingorder {
	
	public static void main(String[] args) {
		
	TreeSet<Integer> ts = new TreeSet<Integer>(new MyCom());
ts.add(10);
ts.add(20);
ts.add(10);
ts.add(30);
	
System.out.println(ts);
	}
}
