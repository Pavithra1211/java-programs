package stringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RepeatedWords {

	public static void main(String[] args) {
		RepeatedWords r = new RepeatedWords();
		r.repeatedWord("A big black bug bit a big black dog on his big black nose");

	}
		
	public void repeatedWord(String line) {	
		
		int count = 0;
		String repeatedWord = null;
		
		String[] words = line.toLowerCase().split(" ");
		
		Map<String, Integer> wordsMap = new HashMap<String, Integer>();
		
		for(String word : words) {
			
			if(wordsMap.containsKey(word)) 
				wordsMap.put(word, wordsMap.get(word)+1);
			else
				wordsMap.put(word,1);			
		}
		
		Set<Entry<String, Integer>> entryset = wordsMap.entrySet();
		
		for (Entry<String, Integer> entry : entryset) {
			
			if(entry.getValue()>count) {
				repeatedWord = entry.getKey();
				count = entry.getValue();
			}
			
		}
		
		System.out.println("Most repeated string "+repeatedWord+" for "+count+" times.");
		
		
		
		
	}

}
