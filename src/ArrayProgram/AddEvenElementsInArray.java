package ArrayProgram;

public class AddEvenElementsInArray {
public static void main(String[] args) {
	int add=0;
	int a[] = {1,2,3,4,5,6,7,8,9};
	for(int i=0; i<a.length; i++)
	{
		if(i%2==0)
		{
		add= add+a[i];
		}
	}
	System.out.println(add);
}
}
