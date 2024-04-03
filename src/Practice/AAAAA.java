package Practice;
public class AAAAA {
public static void main(String[] args) {

	String s="dcba cba ba a";
	String rev=" ";
	String [] ss =s.split(" ");
	for(String SS:ss)
	{
		
		String revw=" ";
		for(int i=SS.length()-1; i>=0; i--)
		{
			revw=revw+SS.charAt(i);
			
		}
		rev=rev+revw+"";
	}
	System.out.println(rev);
	}
}

