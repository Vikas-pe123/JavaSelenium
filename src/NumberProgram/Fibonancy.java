package NumberProgram;

public class Fibonancy {
public static void main(String[] args) {
	int n=15; int x=0; int y=1; int z=0;
	while(z<=n)
	{
		x=y; y=z; z=x+y;
	System.out.println(z);
		
	}
	
}
}
