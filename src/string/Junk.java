package string;

public class Junk {

	public static void main(String[] args) {
		
		
		String s = "Selenium #$@!^&%$ Testing";
		
		s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		
		System.out.println(s);
		
		String s1 =s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s1);
	}

}
