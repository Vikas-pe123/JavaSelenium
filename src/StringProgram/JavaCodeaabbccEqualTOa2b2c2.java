package StringProgram;

public class JavaCodeaabbccEqualTOa2b2c2 {

	public static void main(String[] args) {
		String s = "aaabdhhhssassa";
		String numericstring = "";
	    char[] c = s.toCharArray();
	    int count = 0;
		for (int i = 0; i < s.length(); i++) {
			count = 0;
			for (int j = 0; j < s.length() ; j++) {
				if (j < i && c[i] == c[j]) {
					break;
				}
				if (c[j] == c[i]) {
					count++;

				}
				if (j == s.length() - 1) {

					String value = Integer.toString(count);

					String modifiedstring = c[i] + value;

					numericstring = numericstring + modifiedstring;
			}

			}

		}
		System.out.println(numericstring);

	}
	  


	
}
