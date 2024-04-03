package NumberProgram;

public class PrimeNumberss {
public static void main(String[] args) {
	
	int num=9;
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
}
}
