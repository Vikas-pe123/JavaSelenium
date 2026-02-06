package ArrayInterviewProgram;

public class SquareMatrix {
	public static void main(String[] args) {
		int[][] matrix = 
			{
					{1, 2, 3},
					{4, 5, 6},
					{7, 8, 9}
			};

		System.out.println("3x3 Square Matrix:");
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) 
	{
		for (int[] row : matrix) 
		{
			for (int val : row) 
			{
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
}