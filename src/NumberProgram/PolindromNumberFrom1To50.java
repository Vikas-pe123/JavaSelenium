package NumberProgram;

import java.util.ArrayList;

public class PolindromNumberFrom1To50 {
public static void main(String[] args) {
	
	ArrayList polindrom = new ArrayList();
	for(int i=1; i<=50; i++)
	{
		int rem=0; int rev=0; int n=i;
		while(n!=0) {
					rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		
		}
		System.out.println(rev);
	if(rev==n)
	{
		polindrom.add(i);
	}
	else
	{
		rev=0;
	}
	}
	
}
}
