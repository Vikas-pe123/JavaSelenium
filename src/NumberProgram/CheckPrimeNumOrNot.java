package NumberProgram;

public class CheckPrimeNumOrNot {
public static void main(String[] args) {
	int n=11;
	int d=0;
	for(int i=2; i<n/2; i++)
	{
		
		if(n%2==0)
		{
			
			d=d+1;
		}
	}
		if(d==0)
		{
			System.out.println("prime number");
		}
	
		else
		{
		System.out.println("not prime num");	
		}
		}

}
