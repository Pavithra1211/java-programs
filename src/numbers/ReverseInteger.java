package numbers;

public class ReverseInteger {

	public static void main(String[] args) {
		
		int num = 6543; //3456
		
		int revnum = 0;
		
		while(num!=0) {
			
			revnum = revnum*10 + num%10;
			num = num/10;			
			
		}
		
		System.out.println("Reversed integer " + revnum);
		

	}

}
