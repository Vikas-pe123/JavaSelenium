package ArrayInterviewProgram;

import java.util.ArrayList;
import java.util.TreeSet;

public class ThirdLargestNumberInArray {
public static void main(String[] args) {
	int a[]={44,66,99,77,33,22,110,55};  
	TreeSet tr = new TreeSet();
	for(int num:a)
	{
		tr.add(num);
	}
	ArrayList al = new ArrayList(tr);
	System.out.println(al.get(al.size()-1));
	
}
}