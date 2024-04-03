package ScannerClass;

import java.util.Scanner;

public class PolindromNum {
	
	public static void main(String[] args) {
		int rem=0; int rev=0;  
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		while(num!=0)
		{
			rem=num%10; rev=rev*10+rem; num=num/10;
			
		}
		//System.out.println(rev);
if(rev==num)
{
System.out.println("polindrome");	
}
else
{
System.out.println("not polindrome");	
}
}

}
