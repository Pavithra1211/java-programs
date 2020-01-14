package interfaces;

public class Triangle implements IDrawable{

	public void Draw() {
		System.out.println("Let's draw a triangle");
	}
	
	
	public void specificTriangle() {
		System.out.println("Triangle specific method");
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
