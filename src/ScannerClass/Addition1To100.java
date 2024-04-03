package ScannerClass;

import java.util.Scanner;

public class Addition1To100 {

	public static void main(String[] args) {
		int add=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		for(int i=1; i<=num; i++)
		{
			add=add+i;
		}
		System.out.println(add);
		
	}

	
}
