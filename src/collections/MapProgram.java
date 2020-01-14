package collections;

import java.util.HashMap;
import java.util.*;

public class MapProgram {
	
	
	public void add() {
		int c=1+2;
		System.out.println(c);
	}
	
		
	public void add(int a, int b) {
		int c = a+b;
		System.out.println(c);
		
	}
	
	public void add(float a, float b) {
		float c = a+b;
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		
		MapProgram mp = new MapProgram();
		mp.add();
		mp.add(3, 5);
		
		MapProgram.main(8);

	}
	
	public static void main(int a) {
		
		MapProgram mp = new MapProgram();
		mp.add();
		mp.add(3, 5);

	}

}
