package StringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintAtoZ {
//public static void main(String[] args) {
	//for(char i='a'; i<='z'; i++)
	//{
		//System.out.println(i);
	//}
		public static void main(String[] args) {
	
  String s = "Sam went went to to to his business";
    String[] arr = s.split(" ");
    //arr={Sam,went,went,to,to ,to ,his ,business};
    Set<String> ss = new LinkedHashSet<String>();
    for(int i=0;i<arr.length;i++){
        ss.add(arr[i]);
    }
    for(String sss:ss){
        System.out.print(sss+" ");
    }
    System.out.println();
}  
	
}

