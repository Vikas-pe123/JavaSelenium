package ArrayInterviewProgram;
public class SumOfOddElemet {
	public static void main(String[] args) {
		int sum=0;
		int [] a = new int [] {1, 2, 3, 4, 5};  
		 for(int i=0; i<a.length; i++)
		 {
			 if(i%2==1)
			 {
			 sum=sum+a[i];
			 }
		 }
		 System.out.println(sum); }}