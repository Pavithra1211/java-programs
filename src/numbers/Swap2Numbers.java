package numbers;

public class Swap2Numbers {
	
	public static void swapwiththirdvaiable(int a, int b) {
		int temp = 0;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println(a +" "+b);
	}
	
	public static void swapNumbers(int a, int b) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println(a +" "+b);
		
		//using * operator
		
		a = a * b;
		b = a / b;
		a = a / b;
		
		System.out.println(a +" "+b);
		
		//using ^(XOR) operator
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		
		System.out.println(a +" "+b);
	}

	public static void main(String[] args) {
		swapwiththirdvaiable(10, 20);
		swapNumbers(10, 20);

	}

}
