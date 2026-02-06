package StringProgram;

public class WordRevInString {

	public static void main(String[] args) 
	{
		String s="abc def";
		String [] splitvalue = s.split(" "); // split the string into word
		String rev="";
		for(String ss:splitvalue)
		{
			String revword="";
			for(int i=ss.length()-1; i>=0; i--)
			{
				revword=revword+ss.charAt(i);

			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

	}

}
