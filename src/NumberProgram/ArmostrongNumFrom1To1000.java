package NumberProgram;

public class ArmostrongNumFrom1To1000 {
public static void main(String[] args) {
	for(int i=1; i<=1000; i++)
	{
		int rem=0; int sum=0;
		int n=i;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+(rem*rem*rem);
			n=n/10;
		}
		if(sum==i)
		{
			System.out.println(sum);
		}
	
	}
}
}
