package NumberProgram;

public class FinalKeywardProgram {
	public static void main(String[] args) {
		final int i;
		i = 20;
		int j = i+20; // 40
		//  i = j+30; //70 once we declare variable as final we are not change or reassign the value
		System.out.println(i + " " + j);
	}
}
