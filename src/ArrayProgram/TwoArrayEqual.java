package ArrayProgram;

import java.util.Arrays;

public class TwoArrayEqual {
public static void main(String[] args) {
	
	int a[] = {123};
	int b[] = {123};
	boolean results = Arrays.equals(a, b);
	System.out.println(results);
	
	if(Arrays.equals(a, b))
	{
		System.out.println("both arrays are equal");
	}
	else
	{
		System.out.println("both arrays are not equal");
	}
}
}
