package ArrayProgram;

public class MinValuesFromArray {
public static void main(String[] args) {
	int a [] = {2,3,1,3,4,5,6,60,40};
	int min=a[0];
		for(int i=0; i<a.length; i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	System.out.println(min);
	
}
}
