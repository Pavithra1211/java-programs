package numbers;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] series = {1, 2, 3, 5};
		
		int sum = 0;
		
		for(int i=0; i<series.length;i++) {
			
			sum += series[i];
			
		}
		
		int expectedsum = 0;
		
		for(int j = 0; j<=5; j++) {
			
			expectedsum += j;
		}
		
		int missingnum = expectedsum - sum;
		
		System.out.println("Missing number is "+missingnum);

	}

}
