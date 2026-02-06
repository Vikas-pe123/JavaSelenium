package StringProgram;

public class SwappingOfTwoStringWithoutThirdVariable {

	public static void main(String[] args) {

		String a="hello";
		String b="world";

		// append a and b
		a=a+b;
		System.out.println("before swappimh = "+a);

		// store initial string a in string b

		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}

}
