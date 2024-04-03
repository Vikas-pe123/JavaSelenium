package ArrayProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class SecondhighestfromArray
{public static void main(String[] args) {
	int a [] = {2,3,1,3,4,5,6,60,40};
	TreeSet tr = new TreeSet();
	for(int num:a)
	{
	tr.add(num);	
	}
	ArrayList al = new ArrayList(tr);
	System.out.println(al.get(al.size()-2));
	System.out.println(al.get(2));

}
}
