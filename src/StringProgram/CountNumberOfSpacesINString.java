package StringProgram;

public class CountNumberOfSpacesINString {
public static void main(String[] args) {
	String s="vikas kum ar";
	int count=0;
	for(int i=0; i<s.length(); i++)
	{
		if(s.charAt(i)==' ')
		{
		count++;	
		}
	}
	System.out.println("spaces avilable in string:"+ count);
}
}
