package StringProgram;

import java.util.Arrays;


public class Anagaram {
public static void main(String[] args) {
	
	/*String x="listen"; 
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
	
	*/
	
	
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
	
	

	String str1 = "Race";
    String str2 = "Care";
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    // check if length is same
    if(str1.length() == str2.length()) 
    {
     
    	// convert strings to char array
      char[] charArray1 = str1.toCharArray();
      char[] charArray2 = str2.toCharArray();
    
      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);
      
     // if sorted char arrays are same then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) 
      {
          System.out.println(str1 + " and " + str2 + " are anagram.");
        }
        else
        {
          System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    

	}
}

