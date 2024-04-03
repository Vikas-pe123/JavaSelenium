package StringProgram;

public class CheckTwoStringsAreEqual {
public static void main(String[] args) {
	String x="silent";
	String y="silent";
	boolean results=x.equals(y);
	System.out.println(results);
	
	if(x.equals(y))
	{
		System.out.println("strings are equals");
	}
	else
	{
		System.out.println("strings are not equals");
	}
}
}
