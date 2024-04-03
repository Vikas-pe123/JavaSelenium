package ScannerClass;

import java.util.Scanner;

public class ArmostrongNum {
	public static void main(String[] args) {
		int rem=0; int sum=0;  
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
			while(num!=0)
		{
	
			rem=num%10; sum=sum+(rem*rem*rem); num=num/10; 
			
		}
		if(sum==num)
		{
			System.out.println("armostrong");
		}
		else
		{
			System.out.println("not armostrong");
		}
	}

}
