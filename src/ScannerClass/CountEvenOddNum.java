package ScannerClass;

import java.util.Scanner;

public class CountEvenOddNum {
	public static void main(String[] args) {
		int evencount=0;
		int oddcount=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Num");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				evencount++;

			}
			else
			{
				oddcount++;
			}
		}
		System.out.println("evencount:"+evencount);
		System.out.println("oddcount:"+oddcount);
	}
}
