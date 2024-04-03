package StringProgram;

public class AdditionofallIntegerAvailableINString {
public static void main(String[] args) {

	String s="120bk60b2";
	String numericstring="";
	int digit=0;
	int temp=0;
	for(int i=0; i<s.length();i++)
	{
	if(Character.isDigit(s.charAt(i)))
	{
		numericstring=numericstring+s.charAt(i);
		temp=1;
		if(i!=s.length()-1) {
			continue;
		}
	}
	if(temp==1)
		{
		int value = Integer.parseInt(numericstring);
		numericstring="";
		digit=value+digit;
		temp=0;
		}
	}
	System.out.println(digit);

}
}