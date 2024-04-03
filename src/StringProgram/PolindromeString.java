package StringProgram;

public class PolindromeString {
	public static void main(String[] args) {
	String s= "abcd";
	String rev="";
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
if(s.equals(rev)) // dcba 
{
System.out.println("polindrome string");	
}
else
{
System.out.println("not a polindrome");	
}
}
}
