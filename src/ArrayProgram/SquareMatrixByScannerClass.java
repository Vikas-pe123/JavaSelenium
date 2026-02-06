package ArrayProgram;

import java.util.Scanner;

public class SquareMatrixByScannerClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter size of square matrix (n): ");
		int n = scanner.nextInt();

		int[][] matrix = new int[n][n];

		System.out.println("Enter elements of " + n + "x" + n + " matrix:");

		for (int i = 0; i < n; i++) 
		{
			for (int j = 0; j < n; j++) 
			{
				matrix[i][j] = scanner.nextInt();
			}
		}
		System.out.println("\nSquare Matrix:");
		for (int[] row : matrix) 
		{
			for (int val : row) 
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}

		scanner.close();
	}

}



