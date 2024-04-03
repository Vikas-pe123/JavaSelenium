package StringProgram;

public class AdditionOfIndividualNumberInString {
public static void main(String[] args) {
	String s="120bk601b2";
	String numericstring="";
	int digit=0;
	for(int i=0; i<s.length(); i++)
	{
		if(Character.isDigit(s.charAt(i)))
		{
			numericstring =s.substring(i,i+1);
			int value = Integer.parseInt(numericstring);
			digit = value+digit;
					
		}
	}
	System.out.println("additio of all individual number in string: "+ digit);
	
}
}
