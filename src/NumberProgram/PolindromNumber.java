package NumberProgram;

public class PolindromNumber {
	public static void main(String[] args) {
		int n=123454321;
		int rev=0;
		int rem=0;
		int temp=n;
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
		if(rev==temp)
		{
			System.out.println("given number is polindrom");
		}
		else
		{
			System.out.println("given number is not polindrom");
		}
	}

}
