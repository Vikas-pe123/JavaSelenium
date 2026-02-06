package ScannerClass;

import java.util.Scanner;

public class PrintUpto8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			if(i%2==0)
			{
				System.out.println("even:"+i);
			}
			else
				System.out.println("odd:"+i);
		}
	}

}