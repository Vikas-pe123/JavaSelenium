package StringProgram;

public class ReverseStringByStringBuffer {
public static void main(String[] args) {
	//StringBuffer sb = new StringBuffer("bhagyashri");
	//sb.reverse();
	//System.out.println(sb);
	
	
	
	String s= "nayan";
	String rev="";
	for(int i=s.length()-1; i>=0; i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
	if(s.equals(rev))
	{
		System.out.println("pol");
	}
	else
	{
		System.out.println("noyt pol");
	}

}
}
