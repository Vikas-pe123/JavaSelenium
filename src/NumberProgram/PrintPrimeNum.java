package NumberProgram;

public class PrintPrimeNum {
public static void main(String[] args) {
	int d=0;
	for(int i=1; i<15; i++)
	{
		for(int j=2; j<i; j++)
		{
			if(i%j==0)
			{
				d=d+1;
			}
		}
			if(d==0)
			{
				System.out.println(i);
			}
			else
			{
				d=0;
			}
		}
	}
}

