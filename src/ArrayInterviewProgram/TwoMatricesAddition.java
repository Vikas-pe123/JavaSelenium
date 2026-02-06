package ArrayInterviewProgram;

public class TwoMatricesAddition {
public static void main(String[] args) {
	
	int a[][] = {{4,4,4},{8,8,8},{9,9,9}};
	int b[][] = {{1,1,1},{5,5,5},{6,6,6}};
	int c[][]= new int[3][3];
	for(int i=0; i<a.length;i++)
	{
		
		for(int j=0; j<b.length;j++)
		{
			c[i][j]=a[i][j]-b[i][j];
			System.out.print(c[i][j]+" ");
		}
		System.out.println();  } } }
