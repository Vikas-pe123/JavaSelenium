package NumberProgram;
public class Practice {
	public static void main(String[] args) {

		int n=153;
		int rev=0; int rem=0;
		int temp=n;
		int count=0;
		while(n!=0)
		{
			//rem=n%10;
			rev=rev+rem;
			n=n/10;
			count++;
		}
		System.out.println(count);

}
}