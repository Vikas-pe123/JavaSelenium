package ScannerClass;

import java.util.Scanner;

public class ArmostrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // Create Scanner object

		System.out.print("Enter a number: ");
		int num = sc.nextInt();  // Read number

		int original = num;
		int sum = 0;
		int digit=0;

		while (num > 0) {
			digit = num % 10;
			sum = sum+(digit * digit * digit); // works correctly for 3-digit numbers
			num /= 10;
		}

		if (sum == original) {
			System.out.println(original + " is an Armstrong number.");
		} else {
			System.out.println(original + " is NOT an Armstrong number.");
		}

	}
}
