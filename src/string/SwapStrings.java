package string;

public class SwapStrings {

	public static void main(String[] args) {
		
		
		String a = "Hello";
		String b = "World";
		
		//1. Append a and b
		a = a+b;
		
		//2. Store initial string a in string b
		b = a.substring(0, a.length() - b.length());
		
		a = a.substring(b.length());
		
		System.out.println("After swapping : "+a+" "+b);
		
		

	}

}
