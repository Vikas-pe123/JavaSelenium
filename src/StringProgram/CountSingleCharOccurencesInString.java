package StringProgram;

public class CountSingleCharOccurencesInString {
	public static void main(String[] args)
	{
	   String s="sheetal";
	   int count=0;
	   for(int i=0;i<s.length();i++)
	   {
	     if(s.charAt(i)=='e')
	     {
	       count++;
	     }
	   }
	  System.out.println("count of e in a string="+count);
	

	
}
}
