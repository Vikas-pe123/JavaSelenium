package ArrayInterviewProgram;
public class SumOfAllElementInArray {
public static void main(String[] args) {
	int sum=0;
	int [] a = new int [] {1, 2, 3, 4, 5};  
	 for(int i=0; i<a.length; i++)
	 {
		 sum=sum+a[i];
	 }
	 System.out.println(sum);
}}
