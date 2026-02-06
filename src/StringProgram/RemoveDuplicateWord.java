package StringProgram;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class RemoveDuplicateWord {
	
//		public static void main(String[] args) {
//		
//	    String sen = "Sam went went to to to his business";
//	    String[] arr = sen.split(" ");
//	    //arr={Sam,went,went,to,to ,to ,his ,business};
//	    Set<String> s = new LinkedHashSet<String>();
//	    for(int i=0;i<arr.length;i++){
//	        s.add(arr[i]);
//	    }
//	    for(String ss:s){
//	        System.out.print(ss+" ");
//	    }
//	    System.out.println();
	//}  
		
	public static void duplicateWords(String inputString) {
        // Splitting inputString into words
        String[] words = inputString.toLowerCase().split("\\W+");

        // Creating one HashMap with words as key and their count as value
         HashMap < String, Integer > hm = new HashMap < String, Integer > ();

        // Checking each word
        for (String word: words) {
            // whether it is present in wordCount
            if (hm.containsKey(word)) {
                // If it is present, incrementing it's count by 1
                hm.put(word, hm.get(word) + 1);
            } else {
                // If it is not present, put that word into wordCount with 1 as
                // it's value
                hm.put(word, 1);
            }
        }

        // Extracting all keys of wordCount
        Set < String > wordsInString = hm.keySet();

        // Iterating through all words in wordCount

        for (String word: wordsInString) {
            // if word count is greater than 1

            if (hm.get(word) > 1) {
                // Printing that word and it's count
                System.out.println(word + " : " + hm.get(word));
            }
        }
    }
	public static void main(String[] args) {

        duplicateWords("java guides java");

        duplicateWords("Java is java again java");

        duplicateWords("Super Man Bat Man Spider Man");
   
	}
}
	
	
	

//public static void main(String[] args) {
//String s = "Super man Spider man Bat man";
// // Removing duplicate words
//    String result = removeDuplicateWords(s);
//    System.out.println("String after removing duplicate words: " + result);
//}
//private static String removeDuplicateWords(String s) {
//    // Splitting the string into words
//    String[] words = s.split("\\s+");
//
//    // Creating a set to store unique words
//    Set<String> uniqueWords = new HashSet<>();
//
//    // Removing duplicate words
//    StringBuilder resultBuilder = new StringBuilder();
//    for (String wd : words) {
//        if (uniqueWords.add(wd)) {
//            resultBuilder.append(wd).append(" ");
//        }
//    }
//
//    // Converting the StringBuilder to a string
//    String result = resultBuilder.toString().trim();
//
//    return result;
//
//}
//
//}
