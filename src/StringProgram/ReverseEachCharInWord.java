package StringProgram;

public class ReverseEachCharInWord {
	public static void main(String[] args) {
		
		String s="madam nayan level nitin ab";
		String rev="";
		String [] splitvalue=s.split(" ");
		for(String Splitvalue:splitvalue)
		{
			
			String revword=" ";
			for(int i=Splitvalue.length()-1; i>=0; i--)
			{
				
				revword=revword+Splitvalue.charAt(i);
			}
			rev=rev+revword+" ";
		}
		System.out.println(rev);

		
		
		
		String str="dcba cba ba a";
		String[] word=str.split(" ");
		String Rev="";
		for(String Words:word)
		{
			String revword=" ";
			for(int i=Words.length()-1;i>=0;i--)
			{
				revword=revword+Words.charAt(i);
			}
			Rev=Rev+revword+ " ";
		}
		System.out.println(Rev);
	}

}
