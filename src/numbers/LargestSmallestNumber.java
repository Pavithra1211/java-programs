package numbers;

public class LargestSmallestNumber {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 45, 7, -9, 100};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0; i<numbers.length; i++) {
			
			if(numbers[i] > largest)
				largest = numbers[i];
			
			else if(numbers[i] < smallest)
				smallest = numbers[i];
		}
		
		System.out.println("Largest number "+largest);
		System.out.println("Smallest number "+smallest);

	}

}
