package StringProgram;

public class WithoutHashMapremoveChar {

	public static void main(String[] args) {
		String s="nayan";
		int count=0;

		for(int i=0; i<s.length()-1; i++)
		{

			count=0;
			for(int j=i+1; j<s.length(); j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}
			if(count>0)
			{
				System.out.println(s.charAt(i));	
			}

		}
	}
}

