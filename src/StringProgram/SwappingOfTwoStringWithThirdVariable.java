package StringProgram;

public class SwappingOfTwoStringWithThirdVariable {
	
	public static void main(String[] args) {
		
	
	String s1 = "java";
    String s2 = "guides";
    String temp;
    
    System.out.println(" before swapping two strings ");
    System.out.println(" s1 => " + s1);
    System.out.println(" s2 => " + s2);

    
    temp = s1; // java
    s1 = s2; // guides
    s2 = temp; // java

    System.out.println(" after swapping two strings ");
    System.out.println(" s1 => " + s1);
    System.out.println(" s2 => " + s2);
}
}
