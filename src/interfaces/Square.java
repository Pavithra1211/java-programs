package interfaces;

public class Square implements IDrawable{
	
	public void Draw() {
		System.out.println("Let's draw a square");
	}

	@Override
	public void print() {
		System.out.println("This is print method");
		
	}

}
