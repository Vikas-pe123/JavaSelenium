package NumberProgram;

public class ReverseNumber {
	/*
	//public static void main(String[] args) {
		int n=12345;
		int rev=0;
		int rem=0;
		
		while(n!=0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		System.out.println(rev);
	}
	//lass HelloWorld {
	 * */
	 
	    public static void main(String[] args) {
	 
	    int n=1234;
	    int rev=0;
	    
	    for(int i=n;i!=0;i=i/10){
	        int rem = i%10;
	        rev=rev*10 + rem;
	    }
	    System.out.println(rev);
	    if(n==rev)
	    {
	        System.out.println("palindrome number");
	    }
	    else
	    {
	        System.out.println("Not palindrome");
	    }
	    }
	}	


