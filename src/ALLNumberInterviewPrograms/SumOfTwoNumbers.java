package ALLNumberInterviewPrograms;

public class SumOfTwoNumbers {
public static void main(String[] args) {
String s="nayan";
String rev="";
for(int i=s.length()-1; i>=0; i--)
	{
	
	rev=rev+s.charAt(i);
	}
System.out.println(rev);
}
}