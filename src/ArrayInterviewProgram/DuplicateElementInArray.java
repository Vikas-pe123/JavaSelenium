package ArrayInterviewProgram;
import java.util.HashMap;
import java.util.Set;
public class DuplicateElementInArray {
public static void main(String[] args) {
    int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
   // Alternative way 
    HashMap<Integer, Integer> hm = new HashMap<Integer , Integer>();
	for(int aa:arr)
	{
		if(hm.containsKey(aa))
		{
			hm.put(aa, hm.get(aa)+1);
		}
		else
		{
			hm.put(aa, 1);
		}}
	//System.out.println(hm);
	Set<Integer> ss= hm.keySet();
	for(int sss:ss) {
		if(hm.get(sss)>1) {
			System.out.println(sss+"="+hm.get(sss));
			
		} } } }
