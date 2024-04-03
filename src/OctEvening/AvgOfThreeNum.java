package OctEvening;

import java.util.Scanner;

public class AvgOfThreeNum {
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number 1 : ");
		double n1 = input.nextDouble();
		System.out.print("Enter the Number 2 : ");
		double n2 = input.nextDouble();
		System.out.print("Enter the Number 3 : ");
		double n3 = input.nextDouble();
		System.out.print("The Average value : " + ((n1 + n2 + n3) / 3 ));
	}

}
