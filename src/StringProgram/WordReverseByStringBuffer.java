package StringProgram;

public class WordReverseByStringBuffer {

	public static void main(String[] args) 
	{

		String s="abc defghi";
		String [] splitvalue = s.split(" "); // split the string into word
		String rev="";
		for(String ss:splitvalue)
		{
			StringBuffer sb = new StringBuffer(ss);
			sb.reverse();
			rev=rev+sb.toString()+" ";
		}
		System.out.println(rev);
	}

}
