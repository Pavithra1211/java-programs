package numbers;

public class FactorialNumber {

	// 1. Without recursive function

	public static void factWithoutRec(int num) {

		int fact = 1;

		if (num == 0)
			System.out.println("Factorial of " + num + " is " + 1);

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}

		System.out.println("Factorial of " + num + " is " + fact);
	}

	// 2. With recursive function: recursive function -> a function calling itself
	public static int fact(int num) {

		int fact = 1;

		if (num == 0)
			return 1;
		else
			fact = num * fact(num-1);
		
		return fact;
		

	}

	public static void main(String[] args) {
		
		System.out.println(fact(5));

	}

}
