package ArrayProgram;

public class SumOfTwoArraysss {
	public static void main(String[] args) {
		// Define two arrays of the same length
		int[] array1 = {1, 2, 3, 4, 5,6};
		int[] array2 = {5, 4, 3, 2, 1,0};

		// Array to store the sum
		int[] sumArray = new int[array1.length];

		// Add elements of both arrays
		for (int i = 0; i < array1.length; i++) {
			sumArray[i] = array1[i] + array2[i];
		}

		// Print the result
		System.out.print("Sum of two arrays: ");
		for (int value : sumArray) {
			System.out.print(value + " ");
		}
	}

}
