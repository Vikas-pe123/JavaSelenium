package ArrayInterviewProgram;
import java.util.Arrays;
public class SecondSmallestNumber {
	public static void main(String[] args) {
		int array[] = {10, 20, 25, 63, 96, 57};
		int size = array.length;
		Arrays.sort(array);
		for(int i=0; i<array.length;i++)
		{
			System.out.println(array[i]+" ");
		}
		
	System.out.println("2nd smallest element is ::"+array[1]);
	}

}
/*

int a[]={44,66,99,77,33,22,110,55}; 
int temp=0;
int size=0;
size = a.length;

for(int i = 0; i<size; i++ ){
   for(int j = i+1; j<size; j++){
      if(a[i]>a[j]){
         temp = a[i];
         a[i] = a[j];
         a[j] = temp;
      }
   }
}
System.out.println("2nd Smallest element of the array is:: "+a[0]);
 */