package StringProgram;

public class PrintSequenceOfString {
public static void main(String[] args) {
	
	String s="komal kadam";
	String [] splitvalue = s.split("");
	int size=splitvalue.length;
	for(int i=0; i<size; i++)
	{
		System.out.print(splitvalue[i]+"");
	}
}
}
