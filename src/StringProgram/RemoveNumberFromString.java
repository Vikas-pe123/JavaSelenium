package StringProgram;

public class RemoveNumberFromString {
public static void main(String[] args) {

	String s="1hj23n3";
	String numericstring="";
	int digit=0;
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			numericstring= numericstring+s.charAt(i);
		}
	}
	System.out.println(numericstring);
}
}
