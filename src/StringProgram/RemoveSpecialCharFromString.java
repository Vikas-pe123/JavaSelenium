package StringProgram;

public class RemoveSpecialCharFromString {
	public static void main(String[] args) {
		
	
String s=  "gw25d1ASHGS6$BHEvgr2r^R@";
String ss=s.replaceAll("[1-9, A-Z, a-z]", "");
System.out.println(ss);
}
}
