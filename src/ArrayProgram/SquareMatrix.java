package ArrayProgram;

public class SquareMatrix {
	public static void main(String[] args) {
		int[][] matrix = 
			{
					{1, 2},
					{4, 5}
			
			};

		System.out.println("2x2 Square Matrix:");
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