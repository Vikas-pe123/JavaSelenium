package StringProgram;

public class ReverseSeqOfString {
	public static void main(String[] args) {
	
String s="gnirts si siht";
String rev="";
String [] splitvalue= s.split("");
for(int i=s.length()-1; i>=0; i--)
{
	System.out.print(splitvalue[i]+"");
}
	}
}
