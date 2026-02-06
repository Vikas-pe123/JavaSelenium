package NumberProgram;
public class Practice {
	public static double findAverage(int a, int b, int c) {
		return (a + b + c) / 3.0;
	}

	public static void main(String[] args) {
		// Example input
		int num1 = 15, num2 = 25, num3 = 35;

		double average = findAverage(num1, num2, num3);
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
	}
}
