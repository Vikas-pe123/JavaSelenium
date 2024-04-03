package StringProgram;
import java.util.Arrays;
public class AAAAAAAAAAAAAAAA {
public static void main(String[] args) {
	/*String s1 ="race";    String s2 ="care";
    
    if(s1.length()==s2.length()){
      char[] char1 = s1.toCharArray(); char[] char2 = s2.toCharArray();
        Arrays.sort(char1);  Arrays.sort(char2);
        
        if(Arrays.equals(char1, char2)){
            
            System.out.println("Anagram");
        }
        else
        {
           System.out.println("Not Anagram"); }  }
           */

   //**************************//
    String x="listena"; 
	String y="silent";
	char [] a = x.toCharArray();
	char [] b = y.toCharArray();
	Arrays.sort(a);
	Arrays.sort(b);
	boolean results = Arrays.equals(a, b);
	if(results == true)
	{
		System.out.println("String is anagram");
	}
	else
	{
		System.out.println("String is not anagram");
	}

















}
}