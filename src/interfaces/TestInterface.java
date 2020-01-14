package interfaces;

public class TestInterface {

	public static void main(String[] args) {
		
		IDrawable s = new Triangle();
		s.Draw();
		
		Triangle t = new Triangle();
		t.Draw();
		t.specificTriangle();

	}

}
