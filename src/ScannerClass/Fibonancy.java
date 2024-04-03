package ScannerClass;

import java.util.Scanner;

public class Fibonancy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num =sc.nextInt();
		int x=0; int y=1; int z=0;
		while(z<=num)
		{
		x=y; y=z; z=x+y;
		System.out.println(z);
		}		
	}


}
