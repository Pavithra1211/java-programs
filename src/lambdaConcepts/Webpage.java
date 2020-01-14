package lambdaConcepts;

public class Webpage {

	public static void main(String[] args) {
		
		// lambda expression - General form
		
		IWebpage wb = new IWebpage() {
			
			@Override
			public void webpage(String name) {
				System.out.println("Webpage --> "+name);
				
			}
		};
		
		IWebpage wb1 = (String name) ->	System.out.println("Webpage --> "+name);  // lambda expression - simplified form
		
		
		wb.webpage("Google");
		wb1.webpage("Facebook");

	}

}
