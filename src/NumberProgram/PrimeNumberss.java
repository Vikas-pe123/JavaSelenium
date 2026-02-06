package NumberProgram;

public class PrimeNumberss {
public static void main(String[] args) {
	
	int num=20;
    for(int i=2;i<=num;i++){
        
        if(num%i==0){
            break;
        }
        if(i==num){
            System.out.println("prime number");
        }
        else{
            System.out.println("not prime");
        }
    }
 /*   int num=5;
    int count=0;
    for(int i=2;i<=num;i++)
    {
	if(num%i==0)
		count++;
	
    }
if(count==1)
	System.out.println("This is prime number");
else
	System.out.println("This is not a prime number");

    }
}
*/
}
}
