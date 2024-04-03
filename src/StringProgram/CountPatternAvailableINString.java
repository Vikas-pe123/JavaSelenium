package StringProgram;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountPatternAvailableINString {
public static void main(String[] args) {
	String s="abcdefabc";
	int count=0;
	Pattern p = Pattern.compile("abc");
	Matcher m = p.matcher(s);
	while(m.find())
	{
		count++;
	}	
	System.out.println("abc pattern available in string is abc :"+ count);
}
}
