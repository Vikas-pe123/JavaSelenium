package ArrayProgram;
public class PrintAllZeroAtLast {
public static void main(String[] args) {

	
	int n=11; int temp=0;
	for(int i=2; i<n/2; i++)
	{
		
			if(n%i==0)
			{
				temp++;
			}
		}
		if(temp==0)
		{
			System.out.println("prime num");
		}
		else
		{
			System.out.println("not prime num"); 	}
	}
}
