package collections;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateNumber {

	public static void main(String[] args) {
		
		String[] names = {"java", "Go", "javascript", "Pythod", "java"};
		
		//1. Compare each element Time complexity O(nxn) - Worst Solutions
		
		for (int i = 0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				
				if(names[i] == names[j])
					System.out.println("Duplicate element is "+names[i]);
			}			
		}
		
		System.out.println("\n*****************************\n");
		
		//2. Using Hash-Set -> java Collections : Stores unique values
		
		Set<String> namesSet = new HashSet<String>();
		
		for(String name : names) {
			//If the element is unique only then the element will be added to the set
			if(namesSet.add(name)==false)
				System.out.println("Duplicate element is "+name);
		}
		
		System.out.println(namesSet);
		
		System.out.println("\n*****************************\n");
		
		
		//3. Using Hashmap -> java collection : Stores element and occurrences
		
		Map<String, Integer> namesMap = new HashMap<String, Integer>();
		
		for(String name : names) {
			if(namesMap.containsKey(name))
				namesMap.put(name, namesMap.get(name)+1);
			else
				namesMap.put(name, 1);		
		}
		
		Set<Entry<String, Integer>> entrySet = namesMap.entrySet();
		
		for(Entry<String, Integer> entry : entrySet) {
			if(entry.getValue()>1)
				System.out.println(entry.getKey());
		}

	}

}
