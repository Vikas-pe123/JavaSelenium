package ArrayInterviewProgram;
public class ArrayCopyProgram 
{
    public static void main(String[] args) 
    {        
        //Initialize array     
   int [] a = new int [] {1, 2, 3, 4, 5,6};     
    //Create another array arr2 with size of arr1    
   int b[] = new int[a.length];    
   //Copying all elements of one array into another    
   for (int i = 0; i < a.length; i++) 
   {     
       b[i] = a[i];     
   }      
    //Displaying elements of array a    
  System.out.println("Elements of original array: ");    
   for (int i = 0; i < a.length; i++) {     
     System.out.print(a[i] + " ");    
  }     
       
   System.out.println();           
   //Displaying elements of array b     
   System.out.println("Elements of new array: ");    
   for (int i = 0; i < b.length; i++) {     
      System.out.print(b[i] + " ");    
   }     }    }
