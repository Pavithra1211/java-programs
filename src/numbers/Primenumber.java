package numbers;

public class Primenumber {

	public static boolean isPrimeNumber(int a) {

		if(a<=1) {
			return false;
		}
		
		for(int i=2; i<a; i++) {
			if(a%i==0)
				return false;
		}
		
		return true;
	}
	
	public static void getPrimeNumbers(int num) {
		
		for(int j=2; j<=num; j++) {
			if(isPrimeNumber(j))
				System.out.print(j+" ");
		}
		
	}

	
	public static void main(String[] args) {

		
		System.out.println(isPrimeNumber(10));
		getPrimeNumbers(20);
	}

}
