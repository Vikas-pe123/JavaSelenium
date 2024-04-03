package ArrayProgram;

import java.util.Arrays;

public class ArraySorting {
public static void main(String[] args) {
	
	int a[] = {2,1,4,3,5,7,8,6};
	Arrays.sort(a);
	for(int i=0; i<a.length; i++)
	{
		System.out.println(a[i]);
	}
}
}
