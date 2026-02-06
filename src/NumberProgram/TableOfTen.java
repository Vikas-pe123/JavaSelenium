package NumberProgram;

public class TableOfTen {
public static void main(String[] args) {
	
	int a=10; int b=0;
	for(int i=1; i<=10; i++)
	{
		b=a*i;
		System.out.println(b);
	}
	
	System.out.println("----");
	
	for(int i=1;  i<=10;  i++)
	{
		System.out.println(i*20);   
    }
	
	System.out.println("----");
	              
	for(int i=25;  i<=250;  i+=25)
	{
		System.out.println(i);   
		
	}
	
	System.out.println("----");
	int i=5;
    while(i<51)
    {
        System.out.println(i);
        i=i+5;
    }
}
}
