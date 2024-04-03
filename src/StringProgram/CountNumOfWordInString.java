package StringProgram;

public class CountNumOfWordInString {
	
	public static void main(String[] args) {
		
		 String s = "welcome to java   tutorial on Java2blog hai";
		 
	     int count = 1;

	     for (int i = 0; i < s.length() - 1; i++)
	     {
	         if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
	         {
	             count++;
	         }
	     }
	     System.out.println("Number of words in a string : " + count);
	     
	     String ss= "pune mumbai chennai banglore";
	     int count1 =ss.split(" ").length;
	     System.out.println(count1);
	     
	     
	}
}